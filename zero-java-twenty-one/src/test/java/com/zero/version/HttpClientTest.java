package com.zero.version;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * JEP 417: Java 原生 HTTP/2 客户端
 * JDK 11 引入了原生的 HTTP 客户端，JDK 21 在此基础上进一步增强了对 HTTP/2 的支持，
 * 使得开发者能够更高效地与支持 HTTP/2 协议的服务器进行通信。
 */
public class HttpClientTest {

    /**
     * 使用 JDK 21 中增强的原生 HTTP 客户端与支持 HTTP/2 协议的服务器进行通信。
     */
    @Test
    public void test() {
        try {
            HttpResponse<String> response;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.baidu.com")).build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done");
        }
    }

}
