package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * JDK 21 对随机生成器进行了改进，引入了一些新的方法和算法，提高了其性能和质量。
 */
public class RandomTest {

    /**
     *  JEP 409: 随机生成器的改进
     * 使用 JDK 21 中改进的 Random 类来生成一个介于 0 和 100 之间的随机数。
     */
    @Test
    public void testRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random number: " + randomNumber);
    }

    /**
     * JEP 432: 并发随机数生成器
     * 使用 JDK 21 中并发安全的随机数生成器来生成随机数，而无需担心多线程环境下的竞态条件。
     */
    @Test
    public void testRandom2() {
        // 生成一个介于 0 和 100 之间的随机数
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 101);
        System.out.println("Random number: " + randomNumber);
    }

}
