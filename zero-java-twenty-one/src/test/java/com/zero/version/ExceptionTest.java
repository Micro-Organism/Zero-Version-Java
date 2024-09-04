package com.zero.version;

import org.junit.jupiter.api.Test;

public class ExceptionTest {

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
