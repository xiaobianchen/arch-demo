package com.arch.demo.component;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by chenxiaobian on 16/11/2.
 */
public enum CheckType {
    SHOP(Lists.newArrayList(CheckEnums.SHOP_NAME),"门店信息校验") ;


    CheckType(List<CheckEnums> value, String name) {
        this.value = value;
        this.name = name;
    }

    private List<CheckEnums> value;
    private String name;

    public List<CheckEnums> getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
