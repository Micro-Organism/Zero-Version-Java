package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * JEP 457: 改进的 JVM 垃圾收集器
 * JDK 21 引入了 JEP 457，该功能改进了 JVM 的垃圾收集器，使得其能够更高效地管理内存，提升应用程序的性能和稳定性。
 */
public class JVMTest {

    /**
     * 创建大量对象以触发 JVM 的垃圾收集器，通过 JEP 457 改进的垃圾收集器，可以更高效地管理这些对象，减少内存泄漏和性能问题。
     */
    @Test
    public void test() {
        // 创建大量对象，触发垃圾收集器
        for (int i = 0; i < 1000000; i++) {
            Object obj = new Object();
        }
    }

}
