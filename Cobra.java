package Atividades_Caroline_Schiavo;
import java.util.Scanner;
public class Cobra {

	public static void main(String[] args) {
	        try (Scanner entrada = new Scanner(System.in)) {
				//cobras v intervalo de um nmr entre os nmrs iguais 5 3 9 3
				//cobras f tem o intervalo de dois nmrs entre os nmrs iguais 3 9 5 3
				System.out.println("Escreva a sequencia:");
				
				int [] numeros = new int[4]; //nmrs vet da sequencia
				
     
      
				for(int i = 0; i < 4; i++) {
					numeros[i] = entrada.nextInt();

				}

				if (numeros[0] == numeros[2] || numeros[1] == numeros[3]) {
					System.out.println("V");

				}

				else {
					System.out.println("F");

				}
			}
		}
	}

