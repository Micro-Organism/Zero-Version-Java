package com.zero.version;

import org.junit.jupiter.api.Test;

import java.util.Properties;

/**
 * JEP 440: 增强的属性支持
 */
public class PropertiesTest {

    /**
     * 通过 Properties 类来操作和管理属性，使得开发者能够更轻松地处理配置信息。
     */
    @Test
    public void test() {
        // 创建属性对象
        Properties props = new Properties();

        // 设置属性值
        props.setProperty("database.url", "jdbc:mysql://localhost:3306/mydb");
        props.setProperty("database.user", "root");
        props.setProperty("database.password", "password");

        // 获取属性值
        String url = props.getProperty("database.url");
        String user = props.getProperty("database.user");
        String password = props.getProperty("database.password");

        // 打印属性值
        System.out.println("URL: " + url);
        System.out.println("User: " + user);
        System.out.println("Password: " + password);
    }

}
