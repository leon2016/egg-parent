package com.leon.egg.core.base.tips;

/**
 * 返回给前台的成功提示
 * 
 * @author wangang
 *
 *         2018年10月8日
 */
public class SuccessTip extends Tip {

	public SuccessTip() {
		super.code = 200;
		super.message = "操作成功";
	}
}
