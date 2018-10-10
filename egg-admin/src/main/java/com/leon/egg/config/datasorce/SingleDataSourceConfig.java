package com.leon.egg.config.datasorce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.leon.egg.core.config.properties.DruidProperties;
import com.leon.egg.core.datascope.DataScopeInterceptor;

/**
 * 单数据源配置
 * 
 * @author wangang
 *
 *         2018年10月9日
 */
@Configuration
@ConditionalOnProperty(prefix = "egg.muti-datasource", name = "open", havingValue = "false", matchIfMissing = true)
@EnableTransactionManagement
@MapperScan(basePackages = { "com.leon.egg.modular.*.dao" })
public class SingleDataSourceConfig {

	/**
	 * 单数据源连接池配置
	 */
	@Bean
	public DruidDataSource dataSource(DruidProperties druidProperties) {
		DruidDataSource dataSource = new DruidDataSource();
		druidProperties.config(dataSource);
		return dataSource;
	}

	/**
	 * mybatis-plus分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	/**
	 * mybatis插件-数据范围拦截器
	 */
	@Bean
	public DataScopeInterceptor dataScopeInterceptor() {
		return new DataScopeInterceptor();
	}

	/**
	 * mybatis插件-乐观锁拦截器
	 */
	@Bean
	public OptimisticLockerInterceptor optimisticLockerInterceptor() {
		return new OptimisticLockerInterceptor();
	}

}
