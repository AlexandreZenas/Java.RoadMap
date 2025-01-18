package com.guide.connections.http_url_connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConectionDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:3000/Hello");

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setRequestMethod("GET");

        int status = httpURLConnection.getResponseCode();
        System.out.println("Código de resposta: " + status);








        BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        System.out.println("Resposta: " + response.toString());


        httpURLConnection.disconnect();

    }
}
