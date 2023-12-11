package Atividades_Caroline_Schiavo;
import java.util.Scanner;
public class Contas {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner (System.in)) {
			int V = entrada.nextInt();
			int A = entrada.nextInt();
			int F = entrada.nextInt();
			int P = entrada.nextInt();

			if (A <= V);
			System.out.println("Poderá pagar uma conta");
			
			if ( V >= A + F);
			System.out.println("Poderá pagar duas contas");

			if (V >= A + F + P);
		}

        System.out.println("Poderá pagar 3 contas");

 }
}