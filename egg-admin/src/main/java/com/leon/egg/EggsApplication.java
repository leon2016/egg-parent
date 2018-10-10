package com.leon.egg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leon.egg.core.config.properties.DruidProperties;

/**
 * SpringBoot方式启动类
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
@RestController
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
 @SpringBootApplication
public class EggsApplication {

	private final static Logger logger = LoggerFactory.getLogger(EggsApplication.class);

	@Autowired
	private DruidProperties druidProperties;

	@RequestMapping("/")
	String index() {
		// return "Hello Spring Boot !";
		return druidProperties.getUrl();
	}

	public static void main(String[] args) {
		SpringApplication.run(EggsApplication.class, args);
		logger.info("EggApplication is success!");
	}
}
