package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * JDK 21 对随机生成器进行了改进，引入了一些新的方法和算法，提高了其性能和质量。
 */
public class RandomTest {

    /**
     * 使用 JDK 21 中改进的 Random 类来生成一个介于 0 和 100 之间的随机数。
     */
    @Test
    public void testRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random number: " + randomNumber);
    }

}
