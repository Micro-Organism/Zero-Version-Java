package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * JDK 21 引入了字符串模板（String Templates），它允许开发者以更简洁和安全的方式嵌入和格式化字符串。
 * 字符串模板避免了手动拼接字符串的错误，提供了一种更直观的方式来创建字符串。
 * java. lang. StringTemplate#STR 是预览 API，可能会在将来的版本中移除
 */
public class StringTemplatesTest {

    @Test
    public void test() {
        String name = "Alice";
        int age = 30;

        String result = STR."Name: \{name}, Age: \{age}";
        System.out.println(result); // 输出: Name: Alice, Age: 30
    }

}
