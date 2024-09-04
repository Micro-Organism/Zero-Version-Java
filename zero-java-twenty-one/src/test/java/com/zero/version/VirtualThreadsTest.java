package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * 虚拟线程是 JDK 21 的一项关键特性，它显著提升了 Java 的并发能力。
 * 虚拟线程是轻量级的线程，能够在无需复杂并发编程的情况下并发执行大量任务。
 */
public class VirtualThreadsTest {

    /**
     * 虚拟线程的启动和上下文切换成本更低，使得在高并发场景下，Java 应用程序可以高效处理大量并发任务。
     */
    @Test
    public void test() {

        try {
            Thread.startVirtualThread(() -> {
                System.out.println("Running in a virtual thread!");
            });
            Thread.sleep(1000); // 确保虚拟线程有时间运行
        }
        catch (InterruptedException e) {
            System.out.println("Thread was interrupted:\t" + e);
        }

    }

}
