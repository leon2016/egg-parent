package com.leon.egg.config.datasorce;

import java.sql.SQLException;
import java.util.HashMap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.leon.egg.core.config.properties.DruidProperties;
import com.leon.egg.core.config.properties.MutiDataSourceProperties;
import com.leon.egg.core.datascope.DataScopeInterceptor;
import com.leon.egg.core.mutidatasource.DynamicDataSource;
import com.leon.egg.core.mutidatasource.aop.MultiSourceExAop;

/**
 * 多数据源配置
 * 
 * 注：由于引入多数据源，所以让spring事务的aop要在多数据源切换aop的后面
 * 
 * @author wangang
 *
 *         2018年10月12日
 */
@Configuration
@ConditionalOnProperty(prefix = "egg.muti-datasource", name = "open", havingValue = "true")
@EnableTransactionManagement(order = 2)
@MapperScan(basePackages = { "com.leon.egg.modular.*.dao", "com.leon.egg.multi.mapper" })
public class MultiDataSourceConfig {

	@Bean
	public MultiSourceExAop multiSourceExAop() {
		return new MultiSourceExAop();
	}

	/**
	 * 第一数据源
	 */
	private DruidDataSource dataSource(DruidProperties druidProperties) {
		DruidDataSource dataSource = new DruidDataSource();
		druidProperties.config(dataSource);
		return dataSource;
	}

	/**
	 * 第二个数据源
	 */
	private DruidDataSource secondDataSource(DruidProperties druidProperties,
	        MutiDataSourceProperties mutiDataSourceProperties) {
		DruidDataSource dataSource = new DruidDataSource();
		druidProperties.config(dataSource);
		mutiDataSourceProperties.config(dataSource);
		return dataSource;
	}

	/**
	 * 多数据源连接池配置
	 */
	@Bean
	public DynamicDataSource mutiDataSource(DruidProperties druidProperties,
	        MutiDataSourceProperties mutiDataSourceProperties) {

		DruidDataSource dataSource = dataSource(druidProperties);
		DruidDataSource secondDataSource = secondDataSource(druidProperties, mutiDataSourceProperties);

		try {
			dataSource.init();
			secondDataSource.init();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}

		DynamicDataSource dynamicDataSource = new DynamicDataSource();
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put(mutiDataSourceProperties.getDataSourceNames()[0], dataSource);
		hashMap.put(mutiDataSourceProperties.getDataSourceNames()[1], secondDataSource);
		dynamicDataSource.setTargetDataSources(hashMap);
		dynamicDataSource.setDefaultTargetDataSource(dataSource);
		return dynamicDataSource;
	}

	/**
	 * mybatis-plus分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	/**
	 * 数据范围mybatis插件
	 */
	@Bean
	public DataScopeInterceptor dataScopeInterceptor() {
		return new DataScopeInterceptor();
	}

	/**
	 * 乐观锁mybatis插件
	 */
	@Bean
	public OptimisticLockerInterceptor optimisticLockerInterceptor() {
		return new OptimisticLockerInterceptor();
	}

	/**
	 * 事务配置
	 *
	 */
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager(DynamicDataSource mutiDataSource) {
		return new DataSourceTransactionManager(mutiDataSource);
	}
}
