package com.leon.egg.core.intercept;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.leon.egg.core.base.controller.BaseController;
import com.leon.egg.core.util.HttpSessionHolder;

/**
 * 静态调用session的拦截器
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
@Aspect
@Component
public class SessionHolderInterceptor extends BaseController {

	@Pointcut("execution(* com.leon.egg.*..controller.*.*(..))")
	public void cutService() {
	}

	@Around("cutService()")
	public Object sessionKit(ProceedingJoinPoint point) throws Throwable {
		HttpSessionHolder.put(super.getHttpServletRequest().getSession());
		try {
			return point.proceed();
		} finally {
			HttpSessionHolder.remove();
		}
	}
}
