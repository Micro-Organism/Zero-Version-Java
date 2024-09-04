package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * ZGC（The Z Garbage Collector）是JDK 11中推出的一款低延迟垃圾回收器，它的设计目标包括：
 * 停顿时间不超过10ms；
 * 停顿时间不会随着堆的大小，或者活跃对象的大小而增加；
 * 支持8MB~4TB级别的堆（未来支持16TB）。
 * <href ref="https://tech.meituan.com/2020/08/06/new-zgc-practice-in-meituan.html">新一代垃圾回收器ZGC的探索与实践</href>
 */
public class ZGCTest {

    @Test
    public void test() {
        System.out.println("ZGC");
    }

}
