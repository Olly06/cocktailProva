package org.cocktail;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) {

        String urlCocktailRandom = "https://www.thecocktaildb.com/api/json/v1/1/random.php";

        try{

            URL url = new URL(urlCocktailRandom);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Errore HTTP: " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                response.append(output);
            }
            conn.disconnect();

            ObjectMapper objectMapper = new ObjectMapper();
            Drinks drinks = objectMapper.readValue(response.toString(), Drinks.class);

            System.out.println(drinks);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static HttpURLConnection getHttpURLConnection(String urlCocktailRandom) throws URISyntaxException, IOException {
        URI uri = new URI(urlCocktailRandom); //La classe HttpURLConnection richiede di passare una classe URL
        URL url = uri.toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //Mi connetto all'indirizzo, bisogna castarlo perché
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Errore HTTP: " + conn.getResponseCode());
        }
        return conn;
    }
}