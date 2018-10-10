package com.leon.egg.modular.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.leon.egg.modular.system.dao.NoticeMapper;
import com.leon.egg.modular.system.model.Notice;
import com.leon.egg.modular.system.service.INoticeService;

/**
 * 通知表 服务实现类
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

	@Override
	public List<Map<String, Object>> list(String condition) {
		return this.baseMapper.list(condition);
	}
}
