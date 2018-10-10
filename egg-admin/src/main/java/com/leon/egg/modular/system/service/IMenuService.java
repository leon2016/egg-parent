package com.leon.egg.modular.system.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.service.IService;
import com.leon.egg.core.node.MenuNode;
import com.leon.egg.core.node.ZTreeNode;
import com.leon.egg.modular.system.model.Menu;

/**
 * 菜单服务
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public interface IMenuService extends IService<Menu> {

	/**
	 * 删除菜单
	 *
	 */
	void delMenu(Long menuId);

	/**
	 * 删除菜单包含所有子菜单
	 *
	 */
	void delMenuContainSubMenus(Long menuId);

	/**
	 * 根据条件查询菜单
	 */
	List<Map<String, Object>> selectMenus(@Param("condition") String condition, @Param("level") String level);

	/**
	 * 根据条件查询菜单
	 *
	 */
	List<Long> getMenuIdsByRoleId(@Param("roleId") Integer roleId);

	/**
	 * 获取菜单列表树
	 */
	List<ZTreeNode> menuTreeList();

	/**
	 * 获取菜单列表树
	 */
	List<ZTreeNode> menuTreeListByMenuIds(List<Long> menuIds);

	/**
	 * 删除menu关联的relation
	 *
	 */
	int deleteRelationByMenu(Long menuId);

	/**
	 * 获取资源url通过角色id
	 *
	 */
	List<String> getResUrlsByRoleId(Integer roleId);

	/**
	 * 根据角色获取菜单
	 *
	 */
	List<MenuNode> getMenusByRoleIds(List<Integer> roleIds);
}
