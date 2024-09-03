package com.zero.version;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * 函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口
 * 函数式接口可以被隐式转换为 lambda 表达式
 * Lambda 表达式和方法引用（实际上也可认为是Lambda表达式）上
 */
public class FunctionalInterfaceTest {

    @FunctionalInterface
    interface GreetingService{
        void sayMessage(String message);
    }

    @Test
    public void test(){
        GreetingService service = message -> System.out.println("Hello " + message);
        service.sayMessage("World");
    }

    /**
     * Predicate <T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果。
     * 该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）。
     * 该接口用于测试对象是 true 或 false。
     */
    @Test
    public void testPredicate(){
        Predicate<String> predicate = (s) -> !s.isEmpty();
        System.out.println(predicate.test("foo"));              // true
        System.out.println(predicate.negate().test("foo"));     // false

        Predicate<Integer> predicate2 = null;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true
        System.out.println("输出所有数据:");
        predicate2 = n -> true;
        for (Integer n : list) { // 遍历整数列表
            if (predicate2.test(n)) {
                System.out.println(n);
            }
        }
        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true
        System.out.println("输出所有偶数:");
        predicate2 = n -> n % 2 == 0;
        for (Integer n : list) { // 遍历整数列表
            if (predicate2.test(n)) {
                System.out.println(n);
            }
        }
        // Predicate<Integer> predicate2 = n -> n > 3
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n 大于 3 test 方法返回 true
        System.out.println("输出大于 3 的所有数字:");
        predicate2 = n -> n > 3;
        for (Integer n : list) { // 遍历整数列表
            if (predicate2.test(n)) {
                System.out.println(n);
            }
        }
    }

}
