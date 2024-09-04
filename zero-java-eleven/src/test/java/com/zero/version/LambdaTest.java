package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * 3. 改进的Lambda表达式
 */
public class LambdaTest {


    /**
     * Java 11对Lambda表达式进行了改进，允许在Lambda表达式中使用var关键字，并且可以创建自定义的运行时异常。
     */
    @Test
    public void test() {
        //我们创建了一个Consumer函数式接口的实例，它接受一个String类型的参数，并在Lambda表达式中使用var关键字
        //Consumer<String> consumer = var -> System.out.println(var);
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello, Lambda!");
    }

    /**
     * 它可以让我们使用关键字 var 声明局部变量（而不是实际类型），而由编译器根据变量初始化的值自动推断出类型。
     */
    @Test
    public void test2() {
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter((var item) -> item % 2 == 0)
                .forEach(System.out::println);

        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter(item -> item % 2 == 0)
                .forEach(System.out::println);
    }

}
