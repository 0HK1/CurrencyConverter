package controller;


import java.util.Scanner;

import view.ClearConsole;
import view.ShowAllCrypto;
import view.ShowRates;

public class Menu {
	
	ConverterCurrController controller = new ConverterCurrController();
	public void principalMenu() {
		ClearConsole clear = new ClearConsole();
		Scanner sc = new Scanner(System.in);
		ShowRates rates = new ShowRates();
		ConverterCryptoToCurrController cToCurrController = new ConverterCryptoToCurrController();
		ConverterCurrToCryptoController currToCryptoController = new ConverterCurrToCryptoController();
		ShowAllCrypto allCrypto = new ShowAllCrypto();
		System.out.println("Menu \n\n 1 - Cotação Geral de Moedas em Dollar \n\n 2 - Opções de Conversão Monetaria  \n\n 3 - Cotação Geral de Criptos \n\n 4 - Conversão de Criptos em Real \n\n 5 - Conversão de Real para Criptos \n\n 6 - Sair \n\nDigite o valor Desejado:\n");
		int valueMenu = sc.nextInt();
		
		switch (valueMenu) {
		
		case 1:
			clear.clearCMD();
			System.out.println("Contação Geral de Moedas em Dollar");
			rates.Rates();
			break;	
		case 2:
			clear.clearCMD();
			System.out.println("Conversão Monetaria");
			controller.ConverterChoice();
			break;
		case 3:
			clear.clearCMD();
			System.out.println("Cotação Geral de Criptos em Real");
			allCrypto.CryptoValue();
			break;
		case 4:
			clear.clearCMD();
			System.out.println("Conversão de Criptos para Real");
			cToCurrController.ConverterChoice();
			break;
		case 5:
			clear.clearCMD();
			System.out.println("Conversão de Real para Criptos");
			currToCryptoController.ConverterChoice();
			break;
		case 6:
			clear.clearCMD();
			System.out.println("Volte Logo!!!");
			break;
		default:
			clear.clearCMD();
			System.out.println("Opção Invalida");
			principalMenu();
			break;
		}
		sc.close();
	}
	
}
