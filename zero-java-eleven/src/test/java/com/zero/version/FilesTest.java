package com.zero.version;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Files 类的新方法
 * JDK 11 为 java.nio.file.Files 添加了两个新的便利方法：
 * readString(Path) 和 writeString(Path, CharSequence)，用来简化从文件读取和写入字符串。
 */
public class FilesTest {

    @Test
    public void test() {
        try {
            Path path = Paths.get("./src/test/java/com/zero/version/example/example.txt");
            System.out.println(Files.exists(path));  // 检查文件是否存在
            if (!Files.exists(path)) {
                throw new Exception("File not found");
            }
            Files.writeString(path, "Hello, Java 11!");  // 写入文件
            String content = Files.readString(path);     // 读取文件
            System.out.println(content);                 // 输出: Hello, Java 11!
        }
        catch (Exception e) {
            System.out.println("Error: " + Arrays.toString(e.getStackTrace()));
        }

    }

}
