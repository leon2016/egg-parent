package com.leon.egg.modular.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.leon.egg.modular.system.dao.OperationLogMapper;
import com.leon.egg.modular.system.model.OperationLog;
import com.leon.egg.modular.system.service.IOperationLogService;

/**
 * 操作日志 服务实现类
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog>
        implements IOperationLogService {

	@Override
	public List<Map<String, Object>> getOperationLogs(Page<OperationLog> page, String beginTime, String endTime,
	        String logName, String s, String orderByField, boolean asc) {
		return this.baseMapper.getOperationLogs(page, beginTime, endTime, logName, s, orderByField, asc);
	}
}
