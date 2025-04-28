package config;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CryptoFetcher {

    public HashMap<String, Double> fetchCryptoPricesInBRL() {
        HashMap<String, Double> cryptoPrices = new HashMap<>();

        try {
            String endpoint = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum,tether,binancecoin,solana&vs_currencies=brl";
            @SuppressWarnings("deprecation")
			URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            conn.disconnect();

            JsonObject json = JsonParser.parseString(content.toString()).getAsJsonObject();

            for (String key : json.keySet()) {
                double price = json.getAsJsonObject(key).get("brl").getAsDouble();
                cryptoPrices.put(key, price);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cryptoPrices;
    }
}
