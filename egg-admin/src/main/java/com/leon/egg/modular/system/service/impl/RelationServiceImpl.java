package com.leon.egg.modular.system.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.leon.egg.modular.system.dao.RelationMapper;
import com.leon.egg.modular.system.model.Relation;
import com.leon.egg.modular.system.service.IRelationService;

/**
 * 角色和菜单关联表 服务实现类
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements IRelationService {

}
