package com.zh.logback.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rizhi")
@Slf4j
public class LogBackTest {
    //定义日志对象
    public final static Logger LOGGER = LoggerFactory.getLogger(LogBackTest.class);
    private Logger logger = LoggerFactory.getLogger("pay_flow");
    @Test
    public void testSlf4j(){
        for (int i = 0; i < 300000; i++){
            //打印日志信息
            LOGGER.error("error xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            LOGGER.warn("warn xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            LOGGER.info("info xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            LOGGER.debug("debug xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  //默认级别
            LOGGER.trace("trace xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
    }

    @RequestMapping("h")
    public void tets(){
        log.info("sssssssssss");
        LOGGER.info("infosdddddddddddd");
    }


}
