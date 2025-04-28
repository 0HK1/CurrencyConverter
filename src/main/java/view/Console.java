package view;

import controller.Menu;

public class Console {
	public void runConsole() {
		
		System.out.println("***********************************");
		System.out.println("* Bem Vindo ao Currency Converter *");
		System.out.println("***********************************");
		;
		Menu menu = new Menu();
		
		
		menu.principalMenu();
		
	}
	
	
}
