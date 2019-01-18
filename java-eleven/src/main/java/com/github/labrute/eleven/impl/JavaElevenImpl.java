package com.github.labrute.eleven.impl;

import com.github.labrute.eleven.JavaEleven;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class JavaElevenImpl implements JavaEleven {

    @Override
    public void inferenceTypeAndLambda() {
        // Java 10
        var mots = List.of("Hypnotiser", "Oasis", "Bruyant", "Quinze", "Etriers", "Couche");
        mots.stream().filter((String s) -> s.contains("e")).forEach(System.out::println);

        // Java 11
        mots.stream().filter((var s) -> s.contains("e")).forEach(System.out::println);
    }

    public void httpApi() throws IOException, InterruptedException {
        // protocol
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)  // this is the default
                .build();

        // Get
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://http2.github.io/"))
                .GET()   // this is the default
                .build();

        // Post
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://http2.github.io/"))
                .POST(HttpRequest.BodyPublishers.ofString("JSON DATA"))
                .build();

        // Requete Http
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://http2.github.io/"))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Response status code: " + response.statusCode());
        System.out.println("Response headers: " + response.headers());
        System.out.println("Response body: " + response.body());

        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenAccept(responseAsync -> {
                    System.out.println("Response status code: " + responseAsync.statusCode());
                    System.out.println("Response headers: " + responseAsync.headers());
                    System.out.println("Response body: " + responseAsync.body());
                });
    }
}
