package com.arch.demo.component;

/**
 * Created by chenxiaobian on 16/11/2.
 */
public interface CheckAware {

    Boolean contentIsNotBlank(String content);
    Boolean contentLimitCheck(String content,int limit);
}
