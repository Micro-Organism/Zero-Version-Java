package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * JEP 425: 增强的数组支持
 */
public class ArrayTest {

    /**
     * 使用 JDK 21 中增强的数组支持功能，包括使用流操作对数组进行处理以及使用 Arrays 类的方法对数组进行排序。
     */
    @Test
    public void test() {
        int[] array = {1, 2, 3, 4, 5};

        // 使用流操作对数组进行处理
        int sum = Arrays.stream(array).sum();
        System.out.println("Sum: " + sum);

        // 使用 Arrays 类的方法进行数组排序
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

}
