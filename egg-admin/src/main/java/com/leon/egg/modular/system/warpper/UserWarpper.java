package com.leon.egg.modular.system.warpper;

import com.leon.egg.core.common.constant.factory.ConstantFactory;
import com.leon.egg.core.base.warpper.BaseControllerWarpper;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的包装类
 * 
 * @author wangang
 *
 *         2018年10月15日
 */
public class UserWarpper extends BaseControllerWarpper {

	public UserWarpper(List<Map<String, Object>> list) {
		super(list);
	}

	@Override
	public void warpTheMap(Map<String, Object> map) {
		map.put("sexName", ConstantFactory.me().getSexName((Integer) map.get("sex")));
		map.put("roleName", ConstantFactory.me().getRoleName((String) map.get("roleid")));
		map.put("deptName", ConstantFactory.me().getDeptName((Integer) map.get("deptid")));
		map.put("statusName", ConstantFactory.me().getStatusName((Integer) map.get("status")));
	}

}
