package model;

import java.util.HashMap;

import config.CryptoFetcher;

public class GetCryptoValue {
	public double GetValue(String keyCurrency) {
        CryptoFetcher cryptoFetcher = new CryptoFetcher();
        HashMap<String, Double> rates = cryptoFetcher.fetchCryptoPricesInBRL();
        return rates.get(keyCurrency);
    }
}
