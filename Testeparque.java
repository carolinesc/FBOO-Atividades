package Atividades_Caroline_Schiavo;

import java.util.Scanner;

public class Testeparque {

	    public static void main(String[] args) {
	    	 Scanner entrada = new Scanner (System.in);
	    	 
	    	 Brinquedo b1 = new Brinquedo();
	    	 b1.setAltmin(entrada.nextDouble());
	    	 b1.setNome(entrada.next());
	    	 b1.setAlt(entrada.nextInt());
	    	 
	    	 Visitante v1 = new Visitante();
	    	 v1.setAltura(entrada.nextDouble());
	    	 v1.setIdade(entrada.next());
	    	 v1.setIdade(entrada.nextInt());
	    	 
	    	 v1.altmin = b1.setAltmin(0);
	    }
}
