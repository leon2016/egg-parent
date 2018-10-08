package com.leon.egg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot方式启动类
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
@RestController
@SpringBootApplication
public class EggsApplication {

	 private final static Logger logger =
	 LoggerFactory.getLogger(EggsApplication.class);
	@RequestMapping("/")
	String index() {
		return "Hello Spring Boot !";
	}

	public static void main(String[] args) {
		SpringApplication.run(EggsApplication.class, args);
		 logger.info("EggApplication is success!");
	}
}
