package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * JEP 430: 增强的实例操作
 */
public class OptionalTest {

    /**
     * 使用 JDK 21 中增强的实例操作功能，包括使用 Optional 类来对实例进行操作和管理。
     */
    @Test
    public void test(){
        String str = "Hello, world!";

        // 使用 Optional 类的静态方法创建可空对象
        Optional<String> optionalStr = Optional.ofNullable(str);

        // 如果值存在，则对其进行操作
        optionalStr.ifPresent(s -> System.out.println("Length: " + s.length()));

        // 如果值为空，则提供默认值
        String defaultValue = optionalStr.orElse("Default value");
        System.out.println("Value: " + defaultValue);
    }

}
