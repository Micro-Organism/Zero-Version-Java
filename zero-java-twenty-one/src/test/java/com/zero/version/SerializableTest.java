package com.zero.version;

import com.zero.version.example.Animal;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * JEP 428: 默认的序列化版本 UID
 */
public class SerializableTest {

    /**
     * 使用 JDK 21 中默认的序列化版本 UID 来提高序列化的兼容性，使得即使没有明确指定序列化版本 UID 的类也能够正确地进行序列化和反序列化操作。
     */
    @Test
    public void test() {
        try {
            Animal obj = new Animal("Tom", 3);
            // 将对象序列化到文件
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("example.ser"));
            out.writeObject(obj);
            out.close();

            // 从文件中读取对象并反序列化
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("example.ser"));
            Animal newObj = (Animal) in.readObject();
            in.close();

            System.out.println("Deserialized object: " + newObj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
