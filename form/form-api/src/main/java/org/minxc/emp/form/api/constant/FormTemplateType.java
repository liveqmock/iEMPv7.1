package org.minxc.emp.form.api.constant;

/**
 * 描述：FormTemplate的type枚举
 * 作者:min.xianchang
 * 邮箱:xianchangmin@126.com
 * 日期:2018年3月8日 上午10:25:38
 */
public enum FormTemplateType {
	/**
	 * 主表模板
	 */
	MAIN("main", "主表模板"),
	/**
	 * 子表模板
	 */
	SUB_TABLE("subTable", "子表模板")
	;
	/**
	 * key
	 */
	private String key;
	/**
	 * 描述
	 */
	private String desc;

	private FormTemplateType(String key, String desc) {
		this.key = key;
		this.desc = desc;
	}

	public String getKey() {
		return key;
	}

	public String getDesc() {
		return desc;
	}

	/**
	 * <pre>
	 * 根据key来判断是否跟当前一致
	 * </pre>
	 * 
	 * @param key
	 * @return
	 */
	public boolean equalsWithKey(String key) {
		return this.key.equals(key);
	}
}