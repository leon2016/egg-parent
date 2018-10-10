package com.leon.egg.core.util;

import java.util.ArrayList;
import java.util.List;

import com.leon.egg.config.properties.EggProperties;
import com.leon.egg.core.common.constant.Const;
import com.leon.egg.core.node.MenuNode;

/**
 * api接口文档显示过滤
 * 
 * @author wangang
 *
 *         2018年10月10日
 */
public class ApiMenuFilter extends MenuNode {

	public static List<MenuNode> build(List<MenuNode> nodes) {

		// 如果关闭了接口文档,则不显示接口文档菜单
		EggProperties gunsProperties = SpringContextHolder.getBean(EggProperties.class);
		if (!gunsProperties.getSwaggerOpen()) {
			List<MenuNode> menuNodesCopy = new ArrayList<>();
			for (MenuNode menuNode : nodes) {
				if (Const.API_MENU_NAME.equals(menuNode.getName())) {
					continue;
				} else {
					menuNodesCopy.add(menuNode);
				}
			}
			nodes = menuNodesCopy;
		}

		return nodes;
	}
}
