package com.leon.egg.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 默认的配置
 * 
 * @author wangang
 *
 *         2018年10月15日
 */
@Configuration
@PropertySource("classpath:/default-config.properties")
public class DefaultProperties {

}
