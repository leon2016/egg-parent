package com.leon.egg.modular.system.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.service.IService;
import com.leon.egg.core.node.ZTreeNode;
import com.leon.egg.modular.system.model.Role;

/**
 * 角色相关业务
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface IRoleService extends IService<Role> {

	/**
	 * 设置某个角色的权限
	 *
	 * @param roleId
	 *            角色id
	 * @param ids
	 *            权限的id
	 * @date 2017年2月13日 下午8:26:53
	 */
	void setAuthority(Integer roleId, String ids);

	/**
	 * 删除角色
	 *
	 */
	void delRoleById(Integer roleId);

	/**
	 * 根据条件查询角色列表
	 *
	 * @return
	 * @date 2017年2月12日 下午9:14:34
	 */
	List<Map<String, Object>> selectRoles(@Param("condition") String condition);

	/**
	 * 删除某个角色的所有权限
	 *
	 * @param roleId
	 *            角色id
	 * @return
	 * @date 2017年2月13日 下午7:57:51
	 */
	int deleteRolesById(@Param("roleId") Integer roleId);

	/**
	 * 获取角色列表树
	 *
	 * @return
	 * @date 2017年2月18日 上午10:32:04
	 */
	List<ZTreeNode> roleTreeList();

	/**
	 * 获取角色列表树
	 *
	 * @return
	 * @date 2017年2月18日 上午10:32:04
	 */
	List<ZTreeNode> roleTreeListByRoleId(String[] roleId);
}
