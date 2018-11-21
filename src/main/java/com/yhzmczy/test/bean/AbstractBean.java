package com.yhzmczy.test.bean;

import java.io.Serializable;

/**
 * 管理对象的抽象bean
 *
 * @author 许嘉雯
 *
 */
public class AbstractBean implements Serializable {

	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = 9171163029946009519L;

	/**
	 * 任意bean都需要有一个唯一确定ID,来表明该对象的唯一性
	 */
	private String oid = null;

	/**
	 * 记录bean的当前操作ID
	 */
	private int operationId;

	/**
	 * 构造函数
	 */
	public AbstractBean() {
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getOperationId() {
		return operationId;
	}

	public void setOperationId(int operationId) {
		this.operationId = operationId;
	}

}
