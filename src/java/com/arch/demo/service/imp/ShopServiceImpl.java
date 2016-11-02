package com.arch.demo.service.imp;

import com.arch.demo.component.Check;
import com.arch.demo.component.CheckType;
import com.arch.demo.dto.ShopDto;
import com.arch.demo.service.ShopService;
import org.springframework.stereotype.Component;

/**
 * Created by chenxiaobian on 16/11/2.
 */
@Component
public class ShopServiceImpl implements ShopService {
    @Override
    @Check(checkType = CheckType.SHOP)
    public int save(ShopDto shopDto) {
        System.out.println(shopDto);
        return 0;
    }
}
