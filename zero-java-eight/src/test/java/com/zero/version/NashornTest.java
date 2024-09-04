package com.zero.version;

import org.junit.jupiter.api.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Nashorn 一个 javascript 引擎。
 * Nashorn JavaScript Engine 在 Java 15 已经不可用了。
 */
public class NashornTest {

    /**
     * Nashorn 引擎是一个 JavaScript 引擎，它允许在 JVM 上运行 JavaScript 代码。
     * 使用 ScriptEngineManager, JavaScript 代码可以在 Java 中执行
     */
    @Test
    public void test() {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        String name = "Runoob";
        Integer result = null;
        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");
        }
        catch(ScriptException e){
            System.out.println("执行脚本错误: "+ e.getMessage());
        }
        System.out.println(result.toString());
    }

}
