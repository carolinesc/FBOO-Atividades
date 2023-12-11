package Atividades_Caroline_Schiavo;
import java.util.Scanner;
public class Contasresolucao {

	public static void main(String[] args) {
		
		int V, A, P, F;
		
		try (Scanner entrada = new Scanner (System.in)) {
			System.out.println("Valor do saldo:");
			
			  V = entrada.nextInt();
			  	System.out.println("Valor da conta do acougue:");

			  A = entrada.nextInt();
			  	System.out.println("Valor da conta da padaria:");

			  P = entrada.nextInt();
			  	System.out.println("Valor da conta da farmacia:");

			  F = entrada.nextInt();
		}
		  
		if ( V >= (A+F+P)) {
			System.out.println("3");
			
		} else if(V>= (A+F) || V>= (A+P)){
			System.out.println("2");

        if(V >= A || V>= F || V>=P)
        	System.out.println("1");

        }

        }

 

}