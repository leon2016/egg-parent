package com.leon.egg.modular.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.leon.egg.modular.system.model.LoginLog;

/**
 * 登录记录 服务类
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface ILoginLogService extends IService<LoginLog> {

	/**
	 * 获取登录日志列表
	 */
	List<Map<String, Object>> getLoginLogs(Page<LoginLog> page, String beginTime, String endTime, String logName,
	        String orderByField, boolean asc);
}
