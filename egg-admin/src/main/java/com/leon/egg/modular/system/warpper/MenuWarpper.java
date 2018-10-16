package com.leon.egg.modular.system.warpper;

import com.leon.egg.core.base.warpper.BaseControllerWarpper;
import com.leon.egg.core.common.constant.factory.ConstantFactory;
import com.leon.egg.core.constant.IsMenu;

import java.util.List;
import java.util.Map;

/**
 * 菜单列表的包装类
 * 
 * @author wangang
 *
 *         2018年10月15日
 */
public class MenuWarpper extends BaseControllerWarpper {

	public MenuWarpper(List<Map<String, Object>> list) {
		super(list);
	}

	@Override
	public void warpTheMap(Map<String, Object> map) {
		map.put("statusName", ConstantFactory.me().getMenuStatusName((Integer) map.get("status")));
		map.put("isMenuName", IsMenu.valueOf((Integer) map.get("ismenu")));
	}

}
