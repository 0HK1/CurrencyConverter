package view;

import java.util.HashMap;
import java.util.Map.Entry;
import config.CryptoFetcher;

public class ShowAllCrypto {
	public void CryptoValue() {
        CryptoFetcher cryptoFetcher = new CryptoFetcher();
        HashMap<String, Double> rates = cryptoFetcher.fetchCryptoPricesInBRL();

        // Verifica se a lista de taxas não está vazia
        if (rates.isEmpty()) {
            System.out.println("Erro: Não foi possível obter as taxas.");
        } else {
            // Exibindo as taxas junto com as moedas
            for (Entry<String, Double> entry : rates.entrySet()) {
				System.out.println("Código: " + entry.getKey() + "\n Valor: " + entry.getValue()+"\n");
			}
        }
    }
}
