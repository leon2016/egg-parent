package com.leon.egg.core.common.constant.dicmap;

import com.leon.egg.core.common.constant.dicmap.base.AbstractDictMap;

/**
 * 日志的字典
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public class LogDict extends AbstractDictMap {

	@Override
	public void init() {
		put("tips", "备注");
	}

	@Override
	protected void initBeWrapped() {

	}
}
