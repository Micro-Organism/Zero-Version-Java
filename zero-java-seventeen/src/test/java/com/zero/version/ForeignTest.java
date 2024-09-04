package com.zero.version;

import org.junit.jupiter.api.Test;


/**
 * Java 17 继续支持 Foreign Function & Memory API，这使得您可以在 Java 中调用外部函数和访问外部内存。
 */
public class ForeignTest {

    /**
     * Foreign Function & Memory API
     */
    @Test
    void test() {
        // 调用外部函数
//        foreignFunction("myExternalFunction");
        // 访问外部内存
//        foreignMemory("myExternalMemory");
    }

    /**
     * 使用 Foreign Function API
     * 使用 JDK 17 的 Foreign Function API ���用外部函数
     */
    @Test
    public void testForeignFunction() {

    }

    /**
     * 使用 Foreign Memory API
     * 使用 JDK 17 的 Foreign Memory API ��问内存
     */
    @Test
    public void testForeignMemory() {
        try {
//            // 创建一个内存段
//            MemorySegment segment = MemorySegment.allocate(1024, 1);
//
//            // 字符串写入内存段
//            String str = "Hello, World!";
//            MemorySegment strSegment = segment.spliterator(str).trySplit().next();
//            MemoryAddress address = segment.getAddress();
//            address.setMemory(strSegment);
//
//            // 从内存段中读取数据
//            String readStr = new String(address.getMemory().toArray());
//            System.out.println("Read from memory: " + readStr); // 输出: Read from memory: Hello, World!
        }
        catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 使用 Foreign Function & Memory API
     * 使用 JDK 17 的 Foreign Function & Memory API 调用 C 函数
     */
    @Test
    public void testCFunction() {
        try {
//            // 获取 CLinker 实例
//            CLinker linker = CLinker.getInstance();
//
//            // 定义要调用的函数类型
//            MethodType methodType = MethodType.methodType(int.class, int.class, int.class);
//
//            // 定义本地函数签名（C 函数签名：int add(int, int)）
//            FunctionDescriptor functionDescriptor = FunctionDescriptor.of(CLinker.C_INT, CLinker.C_INT, CLinker.C_INT);
//
//            // 加载动态库
//            System.loadLibrary("native"); // 对应的库文件名（如 native.dll 或 libnative.so）
//
//            // 获取本地函数的符号地址
//            SymbolLookup loader = SymbolLookup.loaderLookup();
//            Optional<MemoryAddress> optional = loader.lookup("add");
//            if (optional.isPresent()) {
//                // 获取本地函数的符号地址
//                MemoryAddress addFunctionAddress = optional.get();
//
//                // 创建一个方法句柄来调用本地函数
//                MethodHandle addHandle = linker.downcallHandle(addFunctionAddress, methodType, functionDescriptor);
//
//                // 调用本地函数
//                int result = (int) addHandle.invokeExact(10, 20);
//                System.out.println("Result from C function: " + result); // 输出: Result from C function: 30
//            }
        }
        catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}
