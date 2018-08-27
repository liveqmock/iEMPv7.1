package org.minxc.emp.biz.api.model;

/**
 * <pre>
 * 描述：BusTableRelFk接口类
 * 作者:min.xianchang
 * 邮箱:xianchangmin@126.com
 * 日期:2018年3月26日 下午5:25:46
 * 版权:summer
 * </pre>
 */
public interface BusinessTableRelForeignKey {
	/**
	 * <pre>
	 * 业务表对应的映射字段
	 * </pre>
	 * 
	 * @return
	 */
	String getFrom();

	/**
	 * <pre>
	 * 映射的方式 枚举 BusTableRelFkType
	 * </pre>
	 * 
	 * @return
	 */
	String getType();

	/**
	 * <pre>
	 * 值
	 * </pre>
	 * 
	 * @return
	 */
	String getValue();
}