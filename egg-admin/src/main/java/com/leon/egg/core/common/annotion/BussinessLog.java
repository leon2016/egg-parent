package com.leon.egg.core.common.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.leon.egg.core.common.constant.dicmap.base.AbstractDictMap;
import com.leon.egg.core.common.constant.dicmap.base.SystemDict;

/**
 * 标记需要做业务日志的方法
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface BussinessLog {

	/**
	 * 业务的名称,例如:"修改菜单"
	 */
	String value() default "";

	/**
	 * 被修改的实体的唯一标识,例如:菜单实体的唯一标识为"id"
	 */
	String key() default "id";

	/**
	 * 字典(用于查找key的中文名称和字段的中文名称)
	 */
	Class<? extends AbstractDictMap> dict() default SystemDict.class;
}
