package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

/**
 * JEP 434: 本地类型推断增强
 * 使得开发者能够更轻松地在各种情况下使用 var 关键字进行类型推断。
 */
public class VariableTest {

    /**
     * 在不损失可读性的情况下更灵活地使用 var 关键字进行类型推断。
     */
    @Test
    public void test() {
        // 增强的本地类型推断
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");

        // 遍历集合
        for (var item : list) {
            System.out.println(item.toUpperCase());
        }

        // 使用 var 推断 Map 中的键值对类型
        var map = Map.of("a", 1, "b", 2, "c", 3);
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
