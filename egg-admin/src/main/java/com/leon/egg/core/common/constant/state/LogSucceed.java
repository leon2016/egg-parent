package com.leon.egg.core.common.constant.state;

/**
 * 业务是否成功的日志记录
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public enum LogSucceed {

	SUCCESS("成功"), FAIL("失败");

	String message;

	LogSucceed(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
