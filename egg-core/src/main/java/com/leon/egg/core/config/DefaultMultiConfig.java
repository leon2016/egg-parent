package com.leon.egg.core.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.leon.egg.core.mutidatasource.aop.MultiSourceExAop;

/** 多数据源配置
 * 
 * @author wangang
 *
 * 2018年10月9日
 */
 
@Configuration
@ConditionalOnProperty(prefix = "egg", name = "muti-datasource-open", havingValue = "true")
public class DefaultMultiConfig {

    @Bean
    public MultiSourceExAop multiSourceExAop() {
        return new MultiSourceExAop();
    }
}
