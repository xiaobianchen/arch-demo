package com.arch.test.lambda;

import com.arch.demo.annotation.Test;
import com.arch.demo.annotation.TestInfo;

/**
 * Created by chenxiaobian on 16/11/1.
 */
@TestInfo(priority = TestInfo.Priority.HIGH,createBy = "xiaobian",targs = "{sales}")
public class AnnotationTest {

    @Test
    void testAnnotation() throws Exception{
        if(true){
            throw  new RuntimeException(("This test always failed"));
        }
    }

    @Test
    void testB(){
        if(false){
            throw new RuntimeException("This test always passed");
        }
    }

    public static void main(String[] args) throws Exception {
        new AnnotationTest().testAnnotation();
    }
}
