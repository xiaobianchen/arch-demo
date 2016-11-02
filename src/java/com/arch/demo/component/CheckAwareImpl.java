package com.arch.demo.component;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by chenxiaobian on 16/11/2.
 */
@Component
public class CheckAwareImpl implements CheckAware{
    @Override
    public Boolean contentIsNotBlank(String content) {
        return StringUtils.isEmpty(content);
    }

    @Override
    public Boolean contentLimitCheck(String content, int limit) {
        return content.length()<limit;
    }
}
