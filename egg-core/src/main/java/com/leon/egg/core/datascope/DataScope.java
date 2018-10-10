package com.leon.egg.core.datascope;

import java.util.List;

/**
 * 
 * 
 * ibatis数据范围插件-数据范围model
 * 
 * @author wangang
 *
 *         2018年10月9日
 */
public class DataScope {

	/**
	 * 限制范围的字段名称
	 */
	private String scopeName = "deptid";

	/**
	 * 具体的数据范围
	 */
	private List<Integer> deptIds;

	public DataScope() {
	}

	public DataScope(List<Integer> deptIds) {
		this.deptIds = deptIds;
	}

	public DataScope(String scopeName, List<Integer> deptIds) {
		this.scopeName = scopeName;
		this.deptIds = deptIds;
	}

	public List<Integer> getDeptIds() {
		return deptIds;
	}

	public void setDeptIds(List<Integer> deptIds) {
		this.deptIds = deptIds;
	}

	public String getScopeName() {
		return scopeName;
	}

	public void setScopeName(String scopeName) {
		this.scopeName = scopeName;
	}
}
