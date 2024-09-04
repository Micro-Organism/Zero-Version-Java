package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * JEP 420: 简化的泛型参数名称
 */
public class GenericsTest {

    /**
     * 该功能简化了泛型参数的命名规范，使得开发者能够更清晰地理解泛型类型和方法的含义。
     */
    @Test
    public void test() {
        // 使用简化的泛型参数名称
        List<String> list = List.of("apple", "banana", "orange");
        String first = list.get(0);
        System.out.println("First element: " + first);
    }

}
