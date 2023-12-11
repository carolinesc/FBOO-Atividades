package Atividades_Caroline_Schiavo;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menor = 0; //armazana menor valor
		int numero; //usuario digita
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("digite numeros positivos e negativos:");
			boolean primeiro_numero = true;
			while(true) {
				numero = entrada.nextInt();
				if(numero == 0) {
					break;
				}
				if(primeiro_numero) {
					menor = numero;
					primeiro_numero = false;
				}else if(numero < menor) {
					menor = numero;
				}else {
					System.out.println("o menor numero digitado foi:" + menor);
				}
			}
		}
	}

}
