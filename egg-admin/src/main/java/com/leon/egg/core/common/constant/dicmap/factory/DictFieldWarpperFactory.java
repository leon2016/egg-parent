package com.leon.egg.core.common.constant.dicmap.factory;

import com.leon.egg.core.common.constant.factory.ConstantFactory;
import com.leon.egg.core.common.constant.factory.IConstantFactory;
import com.leon.egg.core.common.exception.BizExceptionEnum;
import com.leon.egg.core.exception.EggException;

import java.lang.reflect.Method;

/**
 * 字典字段的包装器(从ConstantFactory中获取包装值)
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public class DictFieldWarpperFactory {

	public static Object createFieldWarpper(Object parameter, String methodName) {
		IConstantFactory constantFactory = ConstantFactory.me();
		try {
			Method method = IConstantFactory.class.getMethod(methodName, parameter.getClass());
			return method.invoke(constantFactory, parameter);
		} catch (Exception e) {
			try {
				Method method = IConstantFactory.class.getMethod(methodName, Integer.class);
				return method.invoke(constantFactory, Integer.parseInt(parameter.toString()));
			} catch (Exception e1) {
				throw new EggException(BizExceptionEnum.ERROR_WRAPPER_FIELD);
			}
		}
	}

}
