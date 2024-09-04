package com.zero.version;

import org.junit.jupiter.api.Test;

public class PatternMatchingTest {

    /**
     * Pattern Matching for switch
     */
    @Test
    public void testSwitch() {
        //Java 17引入了switch表达式的模式匹配，这使得开发者可以更简洁地处理数据，减少了冗余的代码并提高了代码的可读性。
    }

    /**
     * Pattern Matching for instanceof
     */
    @Test
    public void testInstanceof() {
        //Pattern Matching for instanceof 允许您在 instanceof 语句中使用模式匹配，这使得您的代码更加简洁和易于读懂。
        Object obj = "Hello";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }

}
