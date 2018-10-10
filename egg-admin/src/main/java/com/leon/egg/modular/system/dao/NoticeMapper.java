package com.leon.egg.modular.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.leon.egg.modular.system.model.Notice;

/**
 * 通知表 Mapper 接口
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface NoticeMapper extends BaseMapper<Notice> {

	/**
	 * 获取通知列表
	 */
	List<Map<String, Object>> list(@Param("condition") String condition);

}