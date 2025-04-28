package controller;

import java.util.Scanner;
import model.ConverterCurrency;

public class ConverterCurrController {
    private int choice;
    private double value;
    private String code1, code2;
    
    Scanner sc = new Scanner(System.in);
    
    public void ConverterChoice() {
        ConverterCurrency converter = new ConverterCurrency();
        Menu menu = new Menu();
        
        
        System.out.println("Digite valor que deseja converter:");
        value = sc.nextDouble();
        
        
        System.out.println("Conversão: \n\n 1 - Dollar para Real \n\n 2 - Real para Dollar  \n\n 3 - Real para Peso Argentino \n\n 4 - Real para Euro \n\n 5 - Real para Rupia \n\n 6 - Real para Yuan \n\n Default - Conversão Avulsa (Digitar códigos da moeda EX.: 'BRL')");
        choice = sc.nextInt();
        
        
        System.out.println("\n\n*****************************************************************");
        switch (choice) {
            case 1:
                System.out.println("Valor: " + value + "[USD] corresponde a ======> " + converter.ConverterEUAxBRL(value) + "[BRL]");
                break;
            case 2:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxEUA(value) + "[USD]");
                break;
            case 3:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxARG(value) + "[ARS]");
                break;
            case 4:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxEUR(value) + "[EUR]");
                break;
            case 5:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxRUS(value) + "[INR]");
                break;
            case 6:
                System.out.println("Valor: " + value + "[BRL] corresponde a ======> " + converter.ConverterBRLxCHI(value) + "[CNY]");
                break;
            default:
                
                System.out.println("Digite o Código da Moeda de Origem e o Código da Moeda de Destino (Ex.: 'USD' e 'BRL'):");
                code1 = sc.next();
                code2 = sc.next();
                System.out.println("Valor: " + value + "[" + code1 + "] corresponde a ======> " + converter.ConverterAbstract(value, code1, code2) + "[" + code2 + "]");
                break;
        }
        System.out.println("\n***************************************************************** \n\n");
        menu.principalMenu();
    }
}
