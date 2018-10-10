package com.leon.egg.modular.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.leon.egg.modular.system.model.LoginLog;

/**
 * 登录记录 Mapper 接口
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface LoginLogMapper extends BaseMapper<LoginLog> {

	/**
	 * 获取登录日志
	 */
	List<Map<String, Object>> getLoginLogs(@Param("page") Page<LoginLog> page, @Param("beginTime") String beginTime,
	        @Param("endTime") String endTime, @Param("logName") String logName,
	        @Param("orderByField") String orderByField, @Param("isAsc") boolean isAsc);

}