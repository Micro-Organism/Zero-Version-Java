package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * JEP 468: 改进的线程安全性
 */
public class ThreadTest {

    private static AtomicInteger count = new AtomicInteger(0);

    /**
     * 使用 JDK 21 中的原子操作类 AtomicInteger 来确保在多线程环境中对计数器的安全操作，
     * 通过 JEP 468 改进的线程安全性，可以避免出现竞态条件和数据不一致的问题。
     */
    @Test
    public void test() {
        try {
            // 创建多个线程对计数器进行操作
            for (int i = 0; i < 10; i++) {
                Thread thread = new Thread(() -> {
                    for (int j = 0; j < 1000; j++) {
                        count.incrementAndGet();
                    }
                });
                thread.start();
            }
            // 等待所有线程结束
            Thread.sleep(1000);
            // 打印计数器的值
            System.out.println("Count: " + count);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * JEP 451: 增强的 Thread API
     * 使用 JDK 21 中增强的 Thread API，包括设置线程名称、等待线程结束等操作，使得开发者能够更方便地管理和操作线程。
     */
    @Test
    public void test2() {
        // 创建一个新的线程
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread finished.");
        });

        // 设置线程名称
        thread.setName("MyThread");

        // 启动线程
        thread.start();

        // 等待线程结束
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }

}
