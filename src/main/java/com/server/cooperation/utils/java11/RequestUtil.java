package com.server.cooperation.utils.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestUtil {

    public static String syncGetByJava11(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpResponse<String> response =
                    httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
