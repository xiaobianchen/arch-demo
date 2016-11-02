package com.arch.demo.component;

import com.arch.demo.dto.ShopDto;
import com.arch.demo.utils.Beans;

/**
 * Created by chenxiaobian on 16/11/2.
 */
public enum CheckEnums {
    SHOP_NAME("门店名称不能为空"){
        @Override
        public Boolean doCheck(Object o) {
            ShopDto shopDto = (ShopDto) o;
            return Beans.getBean(CheckAware.class).contentIsNotBlank(shopDto.getName());
        }
    };
    private String desc;

    CheckEnums(String desc) {
        this.desc = desc;
    }

    public abstract Boolean doCheck(Object o);
}
