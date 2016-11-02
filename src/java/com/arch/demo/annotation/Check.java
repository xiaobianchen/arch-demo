package com.arch.demo.annotation;

import java.lang.annotation.*;

/**
 * Created by chenxiaobian on 16/11/1.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Check {

    String param1() default "";

    int param2() default -1;

}
