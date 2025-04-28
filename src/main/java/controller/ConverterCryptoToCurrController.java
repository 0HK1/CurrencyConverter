package controller;

import java.util.Scanner;
import model.CryptToCurr;

public class ConverterCryptoToCurrController {
	private int choice;
	private double value;
	private String code;
	
	Scanner sc = new Scanner(System.in);
	public void ConverterChoice() {
		CryptToCurr converter = new CryptToCurr();
		Menu menu = new Menu();
		System.out.println("Digite valor que deseja converter:");
		value = sc.nextDouble();
		
		System.out.println("Conversão: \n\n 1 - Etherium para Real \n\n 2 - Tether para Real  \n\n 3 - Binancecoin para Real \n\n 4 - Solana para Real \n\n 5 - Bitcoin para Real \n\n Default - Conversão Avulsa");
		choice = sc.nextInt();
		System.out.println("\n\n*****************************************************************");
		switch (choice) {
		case 1:
			System.out.println("Valor: " + value + "[ETH] corresponde a ======> " + converter.ConverterETHxBRL(value) + "[BRL]");
			break;
		case 2:
			System.out.println("Valor: " + value + "[USDt] corresponde a ======> " + converter.ConverterUSDtxBRL(value) + "[BRL]");
			break;
		case 3:
			System.out.println("Valor: " + value + "[BNB] corresponde a ======> " + converter.ConverterBNBxBRL(value) + "[BRL]");
			break;
		case 4:
			System.out.println("Valor: " + value + "[SOL] corresponde a ======> " + converter.ConverterSOLxBRL(value) + "[BRL]");
			break;
		case 5:
			System.out.println("Valor: " + value + "[BTC] corresponde a ======> " + converter.ConverterBTCxBRL(value) + "[BRL]");
			break;
		default:
			System.out.println("Digite o Código da Crypto Desejada para Converter EX.: 'bitcoin");
			code = sc.next();
			System.out.println("Valor: " + value + "[ETH] corresponde a ======> " + converter.ConverterAbstract(value, code) + "["+code+"]");
			break;
		}
		System.out.println("\n***************************************************************** \n\n");
		menu.principalMenu();
	}
}
