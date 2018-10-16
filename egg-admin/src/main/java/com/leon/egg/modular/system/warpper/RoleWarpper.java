package com.leon.egg.modular.system.warpper;

import com.leon.egg.core.common.constant.factory.ConstantFactory;
import com.leon.egg.core.base.warpper.BaseControllerWarpper;

import java.util.List;
import java.util.Map;

/**
 * 角色列表的包装类
 * 
 * @author wangang
 *
 *         2018年10月15日
 */
public class RoleWarpper extends BaseControllerWarpper {

	public RoleWarpper(List<Map<String, Object>> list) {
		super(list);
	}

	@Override
	public void warpTheMap(Map<String, Object> map) {
		map.put("pName", ConstantFactory.me().getSingleRoleName((Integer) map.get("pid")));
		map.put("deptName", ConstantFactory.me().getDeptName((Integer) map.get("deptid")));
	}

}
