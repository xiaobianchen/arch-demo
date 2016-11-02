package com.arch.test.lambda;

import com.arch.demo.annotation.Check;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by chenxiaobian on 16/11/1.
 */
public class AnnotationTest {

    @Test
    public void testAnnotation() throws Exception{
        Method method = Class.forName("CheckImpl").getDeclaredMethod("execute");
        Check check = method.getAnnotation(Check.class);

        System.out.println(check.param1());
        System.out.println(check.param2());
    }
}
