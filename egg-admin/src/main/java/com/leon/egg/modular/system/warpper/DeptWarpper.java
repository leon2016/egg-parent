package com.leon.egg.modular.system.warpper;

import com.leon.egg.core.common.constant.factory.ConstantFactory;
import com.leon.egg.core.base.warpper.BaseControllerWarpper;
import com.leon.egg.core.util.ToolUtil;

import java.util.Map;

/**
 * 部门列表的包装
 * 
 * @author wangang
 *
 *         2018年10月15日
 */
public class DeptWarpper extends BaseControllerWarpper {

	public DeptWarpper(Object list) {
		super(list);
	}

	@Override
	public void warpTheMap(Map<String, Object> map) {

		Integer pid = (Integer) map.get("pid");

		if (ToolUtil.isEmpty(pid) || pid.equals(0)) {
			map.put("pName", "--");
		} else {
			map.put("pName", ConstantFactory.me().getDeptName(pid));
		}
	}

}
