package com.leon.egg.modular.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.leon.egg.core.node.ZTreeNode;
import com.leon.egg.modular.system.model.Dept;

/**
 * 部门表 Mapper 接口
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface DeptMapper extends BaseMapper<Dept> {

	/**
	 * 获取ztree的节点列表
	 */
	List<ZTreeNode> tree();

	/**
	 * 获取所有部门列表
	 */
	List<Map<String, Object>> list(@Param("condition") String condition);

}