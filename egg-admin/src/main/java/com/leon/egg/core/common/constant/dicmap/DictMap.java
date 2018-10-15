package com.leon.egg.core.common.constant.dicmap;

import com.leon.egg.core.common.constant.dicmap.base.AbstractDictMap;

/**
 * 字典map
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public class DictMap extends AbstractDictMap {

	@Override
	public void init() {
		put("dictId", "字典名称");
		put("dictName", "字典名称");
		put("dictValues", "字典内容");
	}

	@Override
	protected void initBeWrapped() {

	}
}
