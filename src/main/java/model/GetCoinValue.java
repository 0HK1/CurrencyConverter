package model;

import java.util.HashMap;
import controller.RequestAPI;

public class GetCoinValue { 
    public double GetValue(String keyCurrency) {
        RequestAPI request = new RequestAPI();
        HashMap<String, Double> rates = request.request();
        return rates.get(keyCurrency);
    }
}
