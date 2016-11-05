package com.arch.demo;

import com.arch.demo.dto.ShopDto;
import com.arch.demo.service.ShopService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenxiaobian on 16/11/2.
 */
public class ShopServiceTest {

    @Autowired
    private ShopService shopService;

    @Test
    public void testSaveShop(){
        ShopDto shopDto = ShopDto.builder().shopId(1203).desc("上海浦东店").build();
        shopService.save(shopDto);
    }
}
