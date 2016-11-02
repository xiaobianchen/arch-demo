package com.arch.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenxiaobian on 16/11/2.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {

    public enum Priority {
        LOW, MEDIUM, HIGH
    }


    Priority priority() default Priority.MEDIUM;

    String[] targs() default "{sales}";

    String createBy() default "xiaobian";

    String lastModified() default "2016/11/2";

}
