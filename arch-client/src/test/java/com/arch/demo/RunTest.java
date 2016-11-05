package com.arch.demo;


import com.arch.demo.annotation.TestInfo;

import java.lang.annotation.Annotation;

/**
 * Created by chenxiaobian on 16/11/2.
 */
public class RunTest {

    public static void main(String[] args) throws Exception{
        Class<AnnotationTest> obj = AnnotationTest.class;
        if(obj.isAnnotationPresent(TestInfo.class)){
            Annotation annotation = obj.getAnnotation(TestInfo.class);
            TestInfo testInfo = (TestInfo) annotation;
            System.out.println(testInfo.priority());
            System.out.println(testInfo.createBy());
            System.out.println("tags:");

            int tagLen = testInfo.targs().length;
            for(String tag:testInfo.targs()){
                if(tagLen>1){
                    System.out.println(tag + ",");
                }else{
                    System.out.println(tag);
                }

                tagLen--;
            }

            System.out.println(testInfo.lastModified());
        }



    }
}
