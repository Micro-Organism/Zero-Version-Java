package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

/**
 * 这项功能提供了一种非侵入式的方式来进行 Java 日志记录，使得开发者能够更轻松地管理应用程序的日志信息。
 */
public class LoggerTest {

    private static final Logger logger = Logger.getLogger(LoggerTest.class.getName());

    /**
     * 使用 JDK 21 中的 java.logging.Logger 类来记录日志信息，而无需引入额外的日志框架
     */
    @Test
    public void test() {
        logger.info("test");
    }

}
