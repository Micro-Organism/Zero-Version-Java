package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * JEP 422: 改进的异常处理
 */
public class ExceptionTest {

    /**
     * 使用改进的异常处理机制来捕获和处理可能发生的异常情况。
     */
    @Test
    public void testException(){
        try {
            // 可能会抛出异常的代码
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // 捕获并处理异常
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }

}
