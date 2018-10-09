package com.leon.egg.core.base.exception;

/**
 * 异常信息接口
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
public interface ServiceExceptionEnum {

	/**
	 * 获取异常编码
	 */
	Integer getCode();

	/**
	 * 获取异常信息
	 */
	String getMessage();
}
