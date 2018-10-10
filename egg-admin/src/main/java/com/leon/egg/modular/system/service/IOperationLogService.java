package com.leon.egg.modular.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.leon.egg.modular.system.model.OperationLog;

/**
 * 操作日志 服务类
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface IOperationLogService extends IService<OperationLog> {

	/**
	 * 获取操作日志列表
	 */
	List<Map<String, Object>> getOperationLogs(Page<OperationLog> page, String beginTime, String endTime,
	        String logName, String s, String orderByField, boolean asc);
}
