package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

/**
 * String 新增方法
 */
public class StringTest {

    /**
     * str.isBlank() - 判断字符串是否为空
     */
    @Test
    public void test1() {
        String str = " ";
        System.out.println(str.isBlank());
    }

    /**
     * str.lines() - 返回由行终止符划分的字符串集合
     */
    @Test
    public void test2() {
        String str = "hello\nworld";
        str.lines().forEach(System.out::println);
        System.out.println(str.lines().count());
        System.out.println(str.lines().collect(Collectors.toList()));

    }

    /**
     * str.repeat() - 重复字符串多少次
     */
    @Test
    public void test3() {
        String str = "pointerJava";
        System.out.println(str.repeat(3));
    }

    /**
     * str.stripLeading() - 删除字符串前面的空格
     */
    @Test
    public void test4() {
        String str = " pointerJava";
        System.out.println(str.stripLeading());
    }

    /**
     * str.stripTrailing() - 删除字符串后面的空格
     */
    @Test
    public void test5() {
        String str = "pointerJava ";
        System.out.println(str.stripTrailing());
    }

    /**
     * str.strip() - 去除字符串首尾空白字符
     */
    @Test
    public void test6() {
        String str = " pointerJava ";
        System.out.println(str.strip());
    }

}
