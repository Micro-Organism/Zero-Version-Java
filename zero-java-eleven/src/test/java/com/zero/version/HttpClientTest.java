package com.zero.version;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

/**
 * 2. HTTP客户端（HttpClient）
 */
public class HttpClientTest {

    /**
     * 使用新的HttpClient发送一个简单的GET请求。
     */
    @Test
    public void test() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.baidu.com")).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + Arrays.toString(e.getStackTrace()));
        }
    }

}
