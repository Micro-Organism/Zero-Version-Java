package com.zero.version;

import org.junit.jupiter.api.Test;

/**
 * Java 17 继续支持 Text Blocks，这是一种新的字符串 literals，它允许您在代码中嵌入多行字符串。
 * Text Blocks 允许您在代码中嵌入多行字符串，这使得您的代码更加简洁和易于读懂。
 * 同时，Text Blocks 也可以帮助您避免一些常见的问题，例如字符串连接和换行符问题。
 */
public class TextBlocksTest {

    /**
     * 要使用 Text Blocks，您可以使用三个单引号 ``` 或三个双引号 """ 将字符串括起来：
     */
    @Test
    public void test() {
        //Text Blocks 可以包含任何字符，包括换行符、空格和特殊字符。您可以使用 \ 字符来转义特殊字符。
        String html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }

}
