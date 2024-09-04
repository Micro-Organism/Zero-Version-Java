package com.zero.version;

import org.junit.jupiter.api.Test;

public class OtherFeatureTest {

    /**
     * 1.嵌套类的增强
     * JDK 11 为嵌套类的 Nest-Based Access Control 引入了支持，改进了编译器和 JVM 之间的访问控制。
     * 这种改进让嵌套类更好地访问外围类的私有成员，提高了运行时性能和安全性。
     */

    /**
     * 2. 弃用 Nashorn JavaScript 引擎
     * Nashorn 作为 Java 与 JavaScript 交互的解决方案，现在建议使用 GraalVM 等替代方案。
     * JDK 11 弃用了 Nashorn JavaScript 引擎，并移除了 jjs 工具和相关的 API。
     */

    /**
     * 3. 简化的启动程序：java 执行单个源文件
     * JDK 11 引入了新的 java 执行单个源文件的命令行选项，简化了 Java 程序的执行过程。
     */
    @Test
    public void test() {
        System.out.println("java HelloWorld.java\n");
        System.out.println("无需先编译该文件，JDK 11 将自动编译并执行它。");
    }

    /**
     * TLS 1.3 支持
     * JDK 11 增加了 TLS 1.3 支持，提高了安全性，并简化了配置。
     */

    /**
     * 标准化的ChaCha20和Poly1305加密算法
     * JDK 11 引入了对 ChaCha20 和 Poly1305 加密算法的支持，这是当前公认的速度和安全性都较高的算法，特别是在移动设备和不支持硬件加速的环境中表现优异。
     */

    /**
     * 删除和弃用的特性
     *  移除 Java EE 和 CORBA 模块。
     *  废弃了 Pack200 工具和 API。
     *  JavaFX 从 JDK 中移除，转移为独立模块。
     */
}
