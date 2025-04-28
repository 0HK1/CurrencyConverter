package controller;

import java.util.Scanner;
import model.CurrToCrypt;

public class ConverterCurrToCryptoController {
    private int choice;
    private double value;
    private String code;
    
    Scanner sc = new Scanner(System.in);
    
    public void ConverterChoice() {
        CurrToCrypt converter = new CurrToCrypt();
        Menu menu = new Menu();
        
        
        System.out.println("Digite valor que deseja converter:");
        value = sc.nextDouble();
        
       
        System.out.println("Conversão: \n\n 1 - Real para Etherium \n\n 2 - Real para Tether \n\n 3 - Real para Binancecoin \n\n 4 - Real para Solana \n\n 5 - Real para Bitcoin \n\n Default - Conversão Avulsa");
        choice = sc.nextInt();
        
        
        System.out.println("\n\n*****************************************************************");
        switch (choice) {
            case 1:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxETH(value) + "[ETH]");
                break;
            case 2:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxUSDt(value) + "[USDt]");
                break;
            case 3:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxBNB(value) + "[BNB]");
                break;
            case 4:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxSOL(value) + "[SOL]");
                break;
            case 5:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxBTC(value) + "[BTC]");
                break;
            default:
                
                System.out.println("Digite o Código da Cripto Desejada para Converter (Ex.: 'bitcoin'):");
                code = sc.next();
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterAbstract(value, code) + "[" + code + "]");
                break;
        }
        System.out.println("\n***************************************************************** \n\n");
        menu.principalMenu();
    }
}
