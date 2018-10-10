package com.leon.egg.core.util;

import com.leon.egg.config.properties.EggProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(EggProperties.class).getKaptchaOpen();
    }
}