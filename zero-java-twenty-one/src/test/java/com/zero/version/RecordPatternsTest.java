package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * 使用记录模式（Record Patterns）增强 Java 编程语言，以解构记录值。
 * 可以嵌套记录模式和类型模式，以实现功能强大、声明性和可组合形式的数据导航和处理。
 */
public class RecordPatternsTest {

    /**
     * 记录（Record）是一种特殊的类，它通过声明字段来表示数据结构。
     * @param x
     * @param y
     */
    public record Record(int x, int y) {
        public int sum() {
            return x + y;
        }
    }

    /**
     * 记录模式（Record Patterns）是一种解构记录值的方式，可以提取记录的字段值，并使用这些值进行条件判断。
     */
    @Test
    public void test() {
        Object  o = new Record(1, 2);
        if (o instanceof Record(int x, int y)) {
            System.out.println(((Record) o).sum());
        }
    }

}
