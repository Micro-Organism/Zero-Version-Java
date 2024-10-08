package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * 4. Epsilon垃圾收集器
 */
public class EpsilonTest {

    /**
     * Java 11引入了一个新的垃圾收集器——Epsilon GC，它是一个无操作的垃圾收集器，不执行任何内存回收。
     * 这对于那些不需要垃圾收集的嵌入式系统或者自定义内存管理的场景非常有用。
     * Epsilon 垃圾收集器不执行任何实际的垃圾回收操作（没有实际的内存回收机制），它只是简单地分配内存并忽略所有的垃圾对象。
     */
    @Test
    public void test() {
        /**
         * 使用场景：
         *  性能测试 ：什么都不执行的 GC 非常适合用于 GC 的差异性分析。no-op （无操作）GC 可以用于过滤掉 GC 诱发的性能损耗，
         *      比如 GC 线程的调度，GC 屏障的消耗，GC 周期的不合适触发，内存位置变化等。此外有些延迟者不是由于 GC 引起的，
         *      比如 scheduling hiccups, compiler transition hiccups，所以去除 GC 引发的延迟有助于统计这些延迟。
         *  内存压力测试：在测试 Java 代码时，确定分配内存的阈值有助于设置内存压力常量值。这时 no-op 就很有用，
         *      它可以简单地接受一个分配的内存分配上限，当内存超限时就失败。例如：测试需要分配小于 1G 的内存，
         *      就使用-Xmx1g 参数来配置 no-op GC，然后当内存耗尽的时候就直接 crash。
         *  VM 接口测试：以 VM 开发视角，有一个简单的 GC 实现，有助于理解 VM-GC 的最小接口实现。它也用于证明 VM-GC 接口的健全性。
         *  极度短暂 job 任务：一个短声明周期的 job 任务可能会依赖快速退出来释放资源，这个时候接收 GC 周期来清理 heap 其实是在浪费时间，
         *      因为 heap 会在退出时清理。并且 GC 周期可能会占用一会时间，因为它依赖 heap 上的数据量。
         *  延迟改进：对那些极端延迟敏感的应用，开发者十分清楚内存占用，或者是几乎没有垃圾回收的应用，此时耗时较长的 GC 周期将会是一件坏事。
         *  吞吐改进：即便对那些无需内存分配的工作，选择一个 GC 意味着选择了一系列的 GC 屏障，所有的 OpenJDK GC 都是分代的，
         *      所以他们至少会有一个写屏障。避免这些屏障可以带来一点点的吞吐量提升。
         */
        System.out.println("启用Epsilon:\t");
        System.out.println("java -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC MyApp");
    }

}
