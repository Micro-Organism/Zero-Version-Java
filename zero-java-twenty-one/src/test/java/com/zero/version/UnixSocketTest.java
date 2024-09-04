package com.zero.version;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class UnixSocketTest {

    /**
     * UnixDomainSocketChannel 没找到
     */
    @Test
    public void test() {
        //try (UnixDomainSocketChannel channel = UnixDomainSocketChannel.open()) {
        try (SocketChannel channel = SocketChannel.open()) {
            // 连接到指定的 Unix 套接字地址
            SocketAddress address = UnixDomainSocketAddress.of("/tmp/mysocket");
            channel.connect(address);

            // 发送数据
            channel.write(ByteBuffer.wrap("Hello, Unix socket!".getBytes()));

            // 读取响应
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = channel.read(buffer);
            buffer.flip();
            byte[] responseBytes = new byte[bytesRead];
            buffer.get(responseBytes);
            String response = new String(responseBytes);
            System.out.println("Response: " + response);
        }
        catch (IOException e) {
            System.out.println( "Failed to connect to Unix socket: " + e.getMessage());
        }
    }

}
