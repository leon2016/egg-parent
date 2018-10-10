package com.leon.egg.core.common.constant;

/**
 * jwt相关配置
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface JwtConstants {

	String AUTH_HEADER = "Authorization";

	String SECRET = "defaultSecret";

	Long EXPIRATION = 604800L;

	String AUTH_PATH = "/gunsApi/auth";

}
