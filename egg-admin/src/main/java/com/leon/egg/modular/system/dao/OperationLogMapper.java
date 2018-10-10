package com.leon.egg.modular.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.leon.egg.modular.system.model.OperationLog;

/**
 * 操作日志 Mapper 接口
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface OperationLogMapper extends BaseMapper<OperationLog> {

	/**
	 * 获取操作日志
	 */
	List<Map<String, Object>> getOperationLogs(@Param("page") Page<OperationLog> page,
	        @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("logName") String logName,
	        @Param("logType") String logType, @Param("orderByField") String orderByField,
	        @Param("isAsc") boolean isAsc);

}