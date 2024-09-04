package com.zero.version;

import org.junit.jupiter.api.Test;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * JEP 423: 在编译时检查动态生成的代码
 */
public class CompileTest {

    /**
     * JDK 21 引入了 JEP 423，该功能使得在编译时能够检查动态生成的代码，从而提前发现潜在的错误。
     */
    @Test
    public void test() {
        String code = """
                      public class GeneratedClass {
                          public void sayHello() {
                              System.out.println("Hello, world!");
                          }
                      }
                      """;

        // 编译动态生成的代码
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, code);

        // 如果编译成功，则加载并执行动态生成的类
        if (result == 0) {
            try {
                Class<?> clazz = Class.forName("GeneratedClass");
                Object obj = clazz.getDeclaredConstructor().newInstance();
                clazz.getMethod("sayHello").invoke(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Compilation failed");
        }
    }

}
