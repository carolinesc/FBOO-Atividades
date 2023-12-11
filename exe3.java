package Atividades_Caroline_Schiavo;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner (System.in)) {
			int num_aleatorio = (int) (Math.random()*100) + 1;
			int tentativas;
			int contador = 0;

   while (true) {
			tentativas = entrada.nextInt();
			contador = contador +1;

   if (num_aleatorio == tentativas) {
			System.out.println("Parabens voce acertou");
			System.out.println("voce jogou: " + contador);

   }else if (num_aleatorio > tentativas) {
			System.out.println("Um pouco mais");

   }else if (num_aleatorio < tentativas){
			System.out.println("Um pouco menos");
 }
}
		}
	}

}

    
