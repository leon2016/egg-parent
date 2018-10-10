package com.leon.egg.modular.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.leon.egg.modular.system.dao.LoginLogMapper;
import com.leon.egg.modular.system.model.LoginLog;
import com.leon.egg.modular.system.service.ILoginLogService;

/**
 * 登录记录 服务实现类
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

	@Override
	public List<Map<String, Object>> getLoginLogs(Page<LoginLog> page, String beginTime, String endTime, String logName,
	        String orderByField, boolean asc) {
		return this.baseMapper.getLoginLogs(page, beginTime, endTime, logName, orderByField, asc);
	}
}
