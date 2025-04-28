package controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import config.ConfigAPI;

public class RequestAPI {
    public HashMap<String, Double> request() {
        ConfigAPI configAPI = new ConfigAPI();
        String urlStr = configAPI.getFullUrl();

        HashMap<String, Double> rates = new HashMap<String, Double>();

        try {
            @SuppressWarnings("deprecation")
			URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Usando JsonParser moderno
            JsonElement root = JsonParser.parseReader(new InputStreamReader(request.getInputStream()));
            JsonObject jsonObj = root.getAsJsonObject();

            // Pega o campo "conversion_rates"
            JsonObject conversionRates = jsonObj.getAsJsonObject("conversion_rates");

            // Itera sobre as moedas e adiciona as taxas à lista
            for (String currency : conversionRates.keySet()) {
            	
                Double rate = conversionRates.get(currency).getAsDouble();
                rates.put(currency, rate);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return rates;
    }
}
