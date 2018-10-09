package com.leon.egg.core.mutidatasource.annotion;

import java.lang.annotation.*;

/**
 * 自定义多数据源切换注解
 * 
 * @author wangang
 *
 *         2018年10月9日
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface DataSource {

	String name() default "";
}
