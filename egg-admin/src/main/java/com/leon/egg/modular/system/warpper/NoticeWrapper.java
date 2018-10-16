package com.leon.egg.modular.system.warpper;

import com.leon.egg.core.common.constant.factory.ConstantFactory;
import com.leon.egg.core.base.warpper.BaseControllerWarpper;

import java.util.Map;

/**
 * 部门列表的包装
 * 
 * @author wangang
 *
 *         2018年10月15日
 */
public class NoticeWrapper extends BaseControllerWarpper {

	public NoticeWrapper(Object list) {
		super(list);
	}

	@Override
	public void warpTheMap(Map<String, Object> map) {
		Integer creater = (Integer) map.get("creater");
		map.put("createrName", ConstantFactory.me().getUserNameById(creater));
	}

}
