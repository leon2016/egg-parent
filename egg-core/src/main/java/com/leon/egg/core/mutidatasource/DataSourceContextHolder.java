package com.leon.egg.core.mutidatasource;

/**
 * 基于Threadlocal的datasource的上下文
 * 
 * thread-bound transaction context
 * 
 * @author wangang
 *
 *         2018年10月9日
 */
public class DataSourceContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	/**
	 * 设置数据源类型
	 *
	 * @param dataSourceType
	 *            数据库类型
	 */
	public static void setDataSourceType(String dataSourceType) {
		contextHolder.set(dataSourceType);
	}

	/**
	 * 获取数据源类型
	 */
	public static String getDataSourceType() {
		return contextHolder.get();
	}

	/**
	 * 清除数据源类型
	 */
	public static void clearDataSourceType() {
		contextHolder.remove();
	}
}
