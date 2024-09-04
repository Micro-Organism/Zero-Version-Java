package com.zero.version;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class CommentTest {

    /**
     * 定义一个自定义注解 @MyAnnotation，它有一个字符串类型的属性 value。
     */
    @Retention(RetentionPolicy.RUNTIME)
    @interface CommentAnnotation {
        String value();
    }

    /**
     * 在方法上使用自定义注解 @MyAnnotation，并设置其 value 属性为 "Example annotation"。
     */
    @CommentAnnotation("Example annotation")
    public void myMethod() {
        // Method body
    }

    /**
     * 使用 JDK 21 中新的注释 API，通过反射获取方法上的注解信息并进行处理。
     */
    @Test
    public void test() {
        try {
            Method method = CommentTest.class.getMethod("myMethod");
            CommentAnnotation annotation = method.getAnnotation(CommentAnnotation.class);

            if (annotation != null) {
                System.out.println("Annotation value: " + annotation.value());
            } else {
                System.out.println("Annotation not found");
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
