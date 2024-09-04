package com.zero.version;

import org.junit.jupiter.api.Test;

import java.io.Console;

/**
 * JDK 21 引入了 JEP 395，该功能提供了基于文本的 UI 工具包，使得开发者能够更轻松地创建命令行界面的用户界面。
 */
public class TextUITest {

    /**
     * 基于文本的 UI 工具包来创建一个简单的命令行界面，使得开发者能够更方便地与用户进行交互。
     */
    @Test
    public void test() {
        Console console = System.console();
        if (console != null) {
            console.printf("Enter your name: ");
            String name = console.readLine();
            console.printf("Hello, %s!\n", name);
        }
        else {
            System.err.println("No console available");
        }
    }

}
