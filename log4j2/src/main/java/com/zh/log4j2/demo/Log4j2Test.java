package com.zh.log4j2.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("log")
public class Log4j2Test {
    // 定义日志记录器对象
    public static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);
    @Test
    public void testQuick() throws Exception {
        LOGGER.fatal("fatal");
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        log.info("label", "label","");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

    public static final Logger log = LogManager.getLogger("label");
    @RequestMapping("test")
    public void testLog(){
        log.fatal("fatal");
        log.error("error");
        log.warn("warn");
        log.info("label", "label","");
        log.debug("debug");
        log.trace("trace");
    }

}
