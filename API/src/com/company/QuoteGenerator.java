package com.company;

import java.net.*;
import java.net.http.*;

public class QuoteGenerator {

    public static String getQuote() {
        try {


            HttpClient client = HttpClient.newHttpClient();
            HttpResponse response = client.send(
                    HttpRequest.newBuilder()
                            .uri(URI.create("https://api.kanye.rest/"))
                            .GET()
                            .build(),
                    HttpResponse.BodyHandlers.ofString());
            String content = (String) response.body();

            return content;
        } catch (Exception e) {

            return "no quote";
        }
    }
}
