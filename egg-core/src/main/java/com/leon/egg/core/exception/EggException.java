package com.leon.egg.core.exception;

/**
 * 异常信息封装类
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
public class EggException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1187438948364367150L;

	private Integer code;

	private String message;

	public EggException(ServiceExceptionEnum serviceExceptionEnum) {
		this.code = serviceExceptionEnum.getCode();
		this.message = serviceExceptionEnum.getMessage();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
