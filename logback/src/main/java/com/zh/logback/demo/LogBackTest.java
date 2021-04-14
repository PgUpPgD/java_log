package com.zh.logback.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {
    //定义日志对象
    public final static Logger LOGGER = LoggerFactory.getLogger(LogBackTest.class);
    @Test
    public void testSlf4j(){
        for (int i = 0; i < 30000; i++){
            //打印日志信息
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            LOGGER.debug("debug");  //默认级别
            LOGGER.trace("trace");
        }
    }



}
