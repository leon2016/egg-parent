package com.leon.egg.core.base.controller;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 错误页面的默认跳转
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
public class EggErrorView implements View {

	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> map, HttpServletRequest httpServletRequest,
	        HttpServletResponse httpServletResponse) throws Exception {
		httpServletRequest.getRequestDispatcher("/global/error").forward(httpServletRequest, httpServletResponse);
	}
}
