package com.leon.egg.core.base.tips;

/**
 * 返回给前台的错误提示
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
public class ErrorTip extends Tip {

	public ErrorTip(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
}
