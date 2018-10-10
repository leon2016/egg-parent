package com.leon.egg.core.log;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.leon.egg.core.util.SpringContextHolder;

/**
 * 被修改的bean临时存放的地方
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
@Component
@Scope(scopeName = WebApplicationContext.SCOPE_SESSION)
public class LogObjectHolder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1574036942117961350L;
	private Object object = null;

	public void set(Object obj) {
		this.object = obj;
	}

	public Object get() {
		return object;
	}

	public static LogObjectHolder me() {
		LogObjectHolder bean = SpringContextHolder.getBean(LogObjectHolder.class);
		return bean;
	}
}
