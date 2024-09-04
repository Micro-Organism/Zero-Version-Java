package com.zero.version;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class StringTest {

    /**
     * 测试字符串的长度和字节数组长度
     * 包括计算代码点数量和将字符串转换为字节数组等。
     */
    @Test
    public void test() {
        String str = "Hello, 世界!";

        // 计算字符串长度（代码点数量）
        int codePointCount = str.codePointCount(0, str.length());
        System.out.println("Code point count: " + codePointCount);

        // 将字符串转换为字节数组
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("Byte length: " + bytes.length);
    }

}
