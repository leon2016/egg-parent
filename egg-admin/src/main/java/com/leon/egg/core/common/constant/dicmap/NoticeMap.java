package com.leon.egg.core.common.constant.dicmap;

import com.leon.egg.core.common.constant.dicmap.base.AbstractDictMap;

/**
 * 通知的映射
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public class NoticeMap extends AbstractDictMap {

	@Override
	public void init() {
		put("title", "标题");
		put("content", "内容");
	}

	@Override
	protected void initBeWrapped() {
	}
}
