package com.leon.egg.modular.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.leon.egg.modular.system.model.Notice;

/**通知表 服务类
 * 
 * @author wangang
 *
 * 2018年10月10日
 */
public interface INoticeService extends IService<Notice> {

    /**
     * 获取通知列表
     */
    List<Map<String, Object>> list(String condition);
}
