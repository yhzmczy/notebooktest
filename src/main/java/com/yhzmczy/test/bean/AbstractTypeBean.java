package com.yhzmczy.test.bean;

/**
 * 默认类型对象Bean
 *
 * @author 许嘉雯
 *
 */
public class AbstractTypeBean extends AbstractBean{
	/**
	 * 序列化id.
	 */
	private static final long serialVersionUID = 732310266069263682L;

	/**
	 * 类型.
	 */
	private int type = -1;

	/**
	 * 获取类型.
	 *
	 * @return type.
	 */
	public int getType() {
		return type;
	}

	/**
	 * 设置类型.
	 *
	 * @param type 类型
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * 获得对象的ID
	 *
	 * @return long
	 */
	public long getUniId() {
		return -1;
	}

}
