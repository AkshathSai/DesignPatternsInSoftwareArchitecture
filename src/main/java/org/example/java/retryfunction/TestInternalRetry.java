package org.example.java.retryfunction;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Slf4j
public class TestInternalRetry {

    public static void main(String[] args) {

        RetryImpl retryImpl = new RetryImpl(5, 5000);

        retryImpl.retry(() -> sendRequest()); // Use VPN for positive case

    }

    public static void sendRequest() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder(URI.create("https://thepiratebay.org/search.php?q=top100:201"))
                .GET()
                .timeout(Duration.ofSeconds(5))
                .build();

        String resp = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        log.info(resp);
    }

}
