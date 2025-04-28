package view;

import java.util.HashMap;
import java.util.Map.Entry;

import controller.RequestAPI;

public class ShowRates {
    public void Rates() {
        RequestAPI requestAPI = new RequestAPI();
        HashMap<String, Double> rates = requestAPI.request();

        // Verifica se a lista de taxas não está vazia
        if (rates.isEmpty()) {
            System.out.println("Erro: Não foi possível obter as taxas.");
        } else {
            // Exibindo as taxas junto com as moedas
            for (Entry<String, Double> entry : rates.entrySet()) {
				System.out.println("Código: " + entry.getKey() + " Valor: " + entry.getValue());
			}
        }
    }
}
