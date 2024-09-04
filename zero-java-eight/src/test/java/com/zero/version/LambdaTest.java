package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class LambdaTest {

    @Test
    public void testLambda() {

    }

    /**
     * 使用 Lambda 表达式计算两个数的和
     */
    @Test
    public void testSum() {
        int a = 1;
        int b = 2;
        IntBinaryOperator intBinaryOperator = (int a1, int b1) -> a + b;
        System.out.println(intBinaryOperator.applyAsInt(a, b));
    }

    /**
     * 使用 Lambda 表达式对列表进行遍历
     */
    @Test
    public void testList() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // 使用 Lambda 表达式遍历列表
        names.forEach(System.out::println);
    }

    /**
     * 使用 Lambda 表达式实现 Runnable 接口
     */
    @Test
    public void testRunnable() {
        // 传统的匿名内部类
//        Runnable runnable1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World!");
//            }
//        };
        // 使用 Lambda 表达式
        Runnable runnable2 = () -> System.out.println("Hello World!");
        runnable2.run();
    }

}
