package com.leon.egg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leon.egg.config.properties.BeetlProperties;

/**
 * SpringBoot方式启动类
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
@SpringBootApplication
public class EggsApplication {

	private final static Logger logger = LoggerFactory.getLogger(EggsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EggsApplication.class, args);
		logger.info("EggApplication is success!");
	}
}
