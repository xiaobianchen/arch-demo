package com.arch.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by chenxiaobian on 16/11/2.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShopDto implements Serializable{

    private int shopId;
    private String name;//门店名称
    private String desc;//门店简介

}
