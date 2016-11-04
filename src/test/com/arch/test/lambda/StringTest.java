package com.arch.test.lambda;

import org.junit.Test;

/**
 * Created by chenxiaobian on 16/11/2.
 */
public class StringTest {

    @Test
    public void test(){
        String a = "a" + "b" + 1;
        String b = "ab1";
        System.out.println(a == b);
    }



}
