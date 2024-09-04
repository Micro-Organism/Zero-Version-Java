package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * JEP 405: 增强的 Pattern Matching for instanceof
 * Java 17 引入了模式匹配，JDK 21 在此基础上进一步改进了对 instanceof 的模式匹配支持。
 * 现在，可以直接在 instanceof 表达式中使用类型转换。
 */
public class PatternMatchingTest {

    /**
     * 使用改进后的 instanceof，其中 s 是在匹配成功后直接转换为 String 类型，从而可以直接使用它的方法。
     */
    @Test
    void testInstanceof() {
        Object obj = "Hello";
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        }
        else {
            System.out.println("Not a String");
        }
    }

    @Test
    void testSwitch() {
        Object obj = "你好";
        Object a = switch (obj) {
            case Integer i -> String.format("int %d", i);
            case String s -> String.format("string %s", s);
            case Double d -> String.format("Double %s", d);
            default -> obj.toString();
        };
        System.out.println(a);
    }

}
