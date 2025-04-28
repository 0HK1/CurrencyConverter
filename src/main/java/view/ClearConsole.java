package view;

import java.io.IOException;

public class ClearConsole {
	public void clearCMD() {
        try {
        	
        	//Remover for no final do projeto 
        	for (int i = 0; i < 50; i++) System.out.println();
            String os = System.getProperty("os.name");
            
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
}
