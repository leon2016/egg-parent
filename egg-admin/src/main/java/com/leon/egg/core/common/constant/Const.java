package com.leon.egg.core.common.constant;

/**
 * 系统常量
 * 
 * @author wangang 在interface里面的变量默认都是public static final
 *
 *         2018年10月10日
 */
public interface Const {
	/*************************************************************
	 * 系统基本配置常量
	 *************************************************************/

	/**
	 * 系统默认的管理员密码
	 */
	String DEFAULT_PWD = "111111";

	/**
	 * 管理员角色的名字
	 */
	String ADMIN_NAME = "administrator";

	/**
	 * 管理员id
	 */
	Integer ADMIN_ID = 1;

	/**
	 * 超级管理员角色id
	 */
	Integer ADMIN_ROLE_ID = 1;

	/**
	 * 接口文档的菜单名
	 */
	String API_MENU_NAME = "接口文档";

}
