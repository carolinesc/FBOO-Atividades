package Aulas_1608;
import java.util.Scanner;
public class Clientecerto {

	public static void main(String[] args) {
		
		        try (Scanner entrada = new Scanner (System.in)) {
					
		        	Academiacerto c1 = new Academiacerto();

					c1.Nome = "Serjao Berranteiro";
					System.out.println("nome: " + c1.Nome);

					c1.Alt = 1.81;
					System.out.println("Altura: " + c1.Alt);

					c1.Peso = 80.9;
					System.out.println("Peso: " + c1.Peso);

					double imc = c1.Peso / (c1.Alt * c1.Alt);
					System.out.println("IMC do cliente 1:" + imc);

					c1.CalcularIMC();
					System.out.println("IMC do clientre pelo método:" + c1.CalcularIMC());
					System.out.println("Peso desejado: " + c1.calcularPesoDesejado(79));
					System.out.println("Digite seu CPF:");

					c1.CPF = entrada.nextInt();
					System.out.println("Digite seu Telefone:");

					c1.Tel = entrada.nextInt();
					System.out.println("Quantos anos voce tem?");

					c1.Idade = entrada.nextInt();
				}
	}
}


