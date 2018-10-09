package com.leon.egg.core.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.leon.egg.core.base.exception.EggException;
import com.leon.egg.core.base.exception.EggExceptionEnum;
import com.leon.egg.core.base.tips.ErrorTip;

/**
 * 全局的的异常拦截器基类（建议分业务模块建立更多的全局异常拦截基类）
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
@ControllerAdvice
public class BaseControllerExceptionHandler {

	private Logger log = LoggerFactory.getLogger(BaseControllerExceptionHandler.class);

	/**
	 * 拦截业务异常
	 */
	@ExceptionHandler(EggException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ErrorTip notFount(EggException e) {
		log.error("业务异常:", e);
		return new ErrorTip(e.getCode(), e.getMessage());
	}

	/**
	 * 拦截未知的运行时异常
	 */
	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ErrorTip notFount(RuntimeException e) {
		log.error("运行时异常:", e);
		return new ErrorTip(EggExceptionEnum.SERVER_ERROR.getCode(), EggExceptionEnum.SERVER_ERROR.getMessage());
	}

}
