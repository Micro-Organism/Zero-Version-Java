package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * 1. 局部变量类型推断（var关键字）
 */
public class VariableTest {

    /**
     * 你可以使用var关键字来声明局部变量，编译器将自动推断变量的类型。
     * var关键字只能用于局部变量，不能用于类变量和实例变量
     */
    @Test
    public void test() {
        //我们不需要显式声明list的类型，编译器会根据右侧的new ArrayList<String>()推断出list是一个ArrayList<String>类型。
        var list = new ArrayList<String>();
        list.add("Hello, World!");
        list.add("Hello, Java!");
        list.forEach(System.out::println);
    }

}
