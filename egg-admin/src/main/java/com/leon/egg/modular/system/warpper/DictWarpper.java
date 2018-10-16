package com.leon.egg.modular.system.warpper;

import com.leon.egg.core.common.constant.factory.ConstantFactory;
import com.leon.egg.modular.system.model.Dict;
import com.leon.egg.core.base.warpper.BaseControllerWarpper;
import com.leon.egg.core.util.ToolUtil;

import java.util.List;
import java.util.Map;

/**
 * 字典列表的包装
 * 
 * @author wangang
 *
 *         2018年10月15日
 */
public class DictWarpper extends BaseControllerWarpper {

	public DictWarpper(Object list) {
		super(list);
	}

	@Override
	public void warpTheMap(Map<String, Object> map) {
		StringBuffer detail = new StringBuffer();
		Integer id = Integer.valueOf(map.get("id").toString());
		List<Dict> dicts = ConstantFactory.me().findInDict(id);
		if (dicts != null) {
			for (Dict dict : dicts) {
				detail.append(dict.getCode() + ":" + dict.getName() + ",");
			}
			map.put("detail", ToolUtil.removeSuffix(detail.toString(), ","));
		}
	}

}
