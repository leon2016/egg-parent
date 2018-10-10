package com.leon.egg.config.web;

import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.leon.egg.config.properties.BeetlProperties;
import com.leon.egg.core.beetl.BeetlConfiguration;

/**
 * web 模板引擎beetl配置类
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
@Configuration
public class BeetlConfig {

	@Autowired
	BeetlProperties beetlProperties;

	/**
	 * beetl的配置
	 */
	@Bean(initMethod = "init")
	public BeetlConfiguration beetlConfiguration() {
		BeetlConfiguration beetlConfiguration = new BeetlConfiguration();
		beetlConfiguration.setResourceLoader(
		        new ClasspathResourceLoader(BeetlConfig.class.getClassLoader(), beetlProperties.getPrefix()));
		beetlConfiguration.setConfigProperties(beetlProperties.getProperties());
		return beetlConfiguration;
	}

	/**
	 * beetl的视图解析器
	 */
	@Bean
	public BeetlSpringViewResolver beetlViewResolver() {
		BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
		beetlSpringViewResolver.setConfig(beetlConfiguration());
		beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
//		beetlSpringViewResolver.setSuffix(".html");
		beetlSpringViewResolver.setOrder(0);
		return beetlSpringViewResolver;
	}
}
