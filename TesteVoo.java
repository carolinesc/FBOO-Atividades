package Atividades_Caroline_Schiavo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteVoo {

		public static void main(String[] args) {

	//scanner

			Scanner entrada = new Scanner(System.in);
			LocalDate dataIda = null;
			LocalDate dataVolta = null;

	//instanciando passageiro

			Passageiro passageiro1 = new Passageiro();
			System.out.println("Insira seus dados:");
			System.out.println("Nome: ");
			passageiro1.setNome(entrada.next());
			System.out.println("Sobrenome: ");
			passageiro1.setSobrenome(entrada.next());
			System.out.println("Email:");
			passageiro1.setEmail(entrada.next());

			//instanciando voo

			int i = 1;
			System.out.println("Quantas passagens voce deseja comprar:");
			entrada.nextInt();
			while( i < 3) {
				Voo voo1 = new Voo("EA598521GT33", 3000f);
				System.out.println("Insira os dados do seu " + i + " voo: ");
				System.out.println("Origem:");
				voo1.setOrigem(entrada.next());
				System.out.println("Destino:");
				voo1.setDestino(entrada.next());
				System.out.println("Data ida(dd-MM-yyyy):");
				String dataI = entrada.next();
				dataIda = LocalDate.parse (dataI, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				System.out.println("Data volta(dd-MM-yyyy):");
				String dataV = entrada.next();
				dataVolta = LocalDate.parse (dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				System.out.println("--------------------------------PASSAGEM-------------------------------------");
				Passagem passagem1 = new Passagem();
				System.out.println("Nome: " + passageiro1.getNome() + "\nSobrenome: " + passageiro1.getSobrenome() + "\nNumero do voo: " + voo1.getNumeroVoo() +
						"\nOrigem do voo: " + voo1.getOrigem() + "\nDestino do voo: " + voo1.getDestino() + "\nPreco do voo: " + voo1.getPreco());
				i++;
				System.out.println("----------------------------------------------------------------------------------------");

			}

		}
}