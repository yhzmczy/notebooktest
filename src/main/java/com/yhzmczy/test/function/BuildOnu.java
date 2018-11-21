package com.yhzmczy.test.function;

import com.yhzmczy.test.bean.EMSOnuBean;

public class BuildOnu {
    public static EMSOnuBean buildOnu(int i){
        EMSOnuBean onu = new EMSOnuBean();
        onu.setBoardId(i);
        onu.setEquipmentId("test"+i);
        onu.setFriendName("myFriendName"+i);
        onu.setFttType("FTTH");
        onu.setGrantMode(1);
        onu.setLanPortsCount(4);
        onu.setLogicSn(i+"");
        onu.setLogicSnPassword(i+"");
        onu.setGrantNo(i);
        onu.setMac(true);
        onu.setName("name"+i);
        onu.setObjectVersion(1);
        onu.setOltId(i);
        onu.setPonId(i);
        onu.setOnuPassword(i+"");
        onu.setOnuServiceType(1);
        onu.setPhySn(i+"");
        onu.setRate(1000d);
        onu.setSlotNo(i);
        onu.setSplitterNO(i);
        onu.setSplitterBranchNO(i);
        onu.setRemark(i+"");
        onu.setVendorId(i+"");
        onu.setOnuId(i);
        return onu;
    }
}
