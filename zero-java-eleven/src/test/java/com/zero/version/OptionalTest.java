package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    /**
     * 新增了 isEmpty() 方法来判断指定的 Optional 对象是否为空。
     */
    @Test
    public void test() {
        var op = Optional.empty();
        System.out.println(op.isEmpty());
    }

}
