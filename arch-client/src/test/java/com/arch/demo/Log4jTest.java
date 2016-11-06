package com.arch.demo;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

/**
 * Created by chenxiaobian on 16/11/6.
 */
@Log4j
public class Log4jTest {

    @Test
    public void testLog(){
        log.debug("debug log....");
        log.info("info log.....");
        log.warn("warn log....");
        log.error("error log.....");
        log.fatal("fatal log.....");
        System.out.println("this is console log");
    }
}
