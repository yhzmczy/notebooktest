package com.yhzmczy.test.bean;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "olt")
public class YhOLTBean extends AbstractBean{

    /**
     * 序列化ID
     * */
    private static final long serialVersionUID = 1127116330871192746L;


}
