package com.yhzmczy.test.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * ONU实体类
 * 
 * @author 许嘉雯
 *
 */
@Document(collection = "onu")
public class EMSOnuBean extends AbstractTypeBean {

	private static final long serialVersionUID = 4925922572616830881L;

	/**
	 * onu Id
	 */
	@Id
	private int onuId;

	/**
	 * 所属单板id
	 */
	@Indexed
	private int boardId;

	/**
	 * 所属OLTid
	 */
	@Indexed
	private int oltId;

	/**
	 * 槽位号
	 */
	@Field("slotNo")
	private int slotNo;

	/**
	 * 所属pon口id
	 */
	@Indexed
	private int ponId;

	/**
	 * ONU授权号
	 */
	@Field("grantNo")
	private int grantNo;

	/**
	 * 授权模式
	 */
	@Field("grantMode")
	private int grantMode;

	/**
	 * 是否是MAC地址
	 */
	@Field("isMacAdr")
	private boolean mac;

	/**
	 * 物理地址mac或物理SN
	 */
	@Field("phySn")
	private String phySn;

	/**
	 * ONU密码
	 */
	@Field("onuPwd")
	private String onuPassword;

	/**
	 * 逻辑sn
	 */
	@Field("logicSn")
	private String logicSn;

	/**
	 * 逻辑sn密码
	 */
	@Field("logicSnPwd")
	private String logicSnPassword;

	/**
	 * ONU名称
	 */
	@Field("name")
	private String name;

	/**
	 * ONU友好名
	 */
	@Field("alias")
	private String friendName;

	/**
	 * ONU版本
	 */
	@Field("version")
	private String version;

	/**
	 * 光分器编号
	 **/
	@Field("splitterNo")
	private int splitterNO;

	/**
	 * 光分器端口号
	 **/
	@Field("splitterPortNo")
	private int splitterBranchNO;

	/**
	 * 备注字段
	 */
	@Field("remark")
	private String remark;

	/**
	 * 对象版本
	 */
	@Field("objVersion")
	private int objectVersion;

	/**
	 * 厂商标识
	 */
	@Field("vendorId")
	private String vendorId;

	/**
	 * ONU类型，取值为B,H,P B-FTTB H-FTTH P-FTTP
	 */
	private String fttType;

	/**
	 * FTTB型ONU下LAN口总数 仅当fttType取值为B时，此参数有效
	 */
	@Field("lanPortsSum")
	private Integer lanPortsCount = 0;

	/**
	 * ONU设备型号
	 */
	@Field("equipmentId")
	private String equipmentId;

	/**
	 * 端口速率（Mb/s） 如果根据端口类型找不到对应的映射关系，则取默认端口类型733的速率1000
	 */
	@Field("rate")
	private Double rate = 1000.0;

	/**
	 * ONU服务等级</br>
	 * 1-表示集客ONU-即VIP-ONU，其他表示其他普通ONU
	 *
	 */
	@Field("onuSerType")
	private Integer onuServiceType;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public int getGrantMode() {
		return grantMode;
	}

	public void setGrantMode(int grantMode) {
		this.grantMode = grantMode;
	}

	public int getGrantNo() {
		return grantNo;
	}

	public void setGrantNo(int grantNo) {
		this.grantNo = grantNo;
	}

	/**
	 * mac
	 * 
	 * @return mac
	 */
	public boolean getMac() {
		return mac;
	}

	public void setMac(boolean mac1) {
		this.mac = mac1;
	}

	public String getLogicSn() {
		return logicSn;
	}

	public void setLogicSn(String logicSn) {
		this.logicSn = logicSn;
	}

	public String getLogicSnPassword() {
		return logicSnPassword;
	}

	public void setLogicSnPassword(String logicSnPassword) {
		this.logicSnPassword = logicSnPassword;
	}

	public String getPhySN() {
		return phySn;
	}

	public void setPhySn(String phySN) {
		this.phySn = phySN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getObjectVersion() {
		return objectVersion;
	}

	public void setObjectVersion(int objectVersion) {
		this.objectVersion = objectVersion;
	}

	public int getPonId() {
		return ponId;
	}

	public void setPonId(int ponId) {
		this.ponId = ponId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getSplitterBranchNO() {
		return splitterBranchNO;
	}

	public void setSplitterBranchNO(int splitterBranchNO) {
		this.splitterBranchNO = splitterBranchNO;
	}

	public int getSplitterNO() {
		return splitterNO;
	}

	public void setSplitterNO(int splitterNO) {
		this.splitterNO = splitterNO;
	}

	public String getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public int getOnuId() {
		return onuId;
	}

	public void setOnuId(int onuId) {
		this.onuId = onuId;
	}

	public int getOltId() {
		return oltId;
	}

	public void setOltId(int oltId) {
		this.oltId = oltId;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public Integer getLanPortsCount() {
		return lanPortsCount;
	}

	public void setLanPortsCount(Integer lanPortsCount) {
		this.lanPortsCount = lanPortsCount;
	}

	public String getFttType() {
		return fttType;
	}

	public void setFttType(String fttType) {
		this.fttType = fttType;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Integer getOnuServiceType() {
		return onuServiceType;
	}

	public void setOnuServiceType(Integer onuServiceType) {
		this.onuServiceType = onuServiceType;
	}

    public String getOnuPassword() {
        return onuPassword;
    }

    public void setOnuPassword(String onuPassword) {
        this.onuPassword = onuPassword;
    }
}
