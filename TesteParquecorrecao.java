package Atividades_Caroline_Schiavo;

import java.util.Scanner;

public class TesteParquecorrecao {
	 public static void main(String[] args) {
		 //Scanner e System
		 Scanner entrada = new Scanner (System.in);
		 //instancia de objetos
		 System.out.println("informe os dados do brinquedo 1");
		 System.out.println("Nome: ");
		 String nomeMontanhaRussa = entrada.nextLine(); //pega a linha inteira da string
		 System.out.println("Altura Mínima: (em metros)");
		 double alturaMinimaMontanhaRussa = entrada.nextDouble();
		 System.out.println("Capacidade Máxima: ");
		 int capacidadeMaximaMontanhaRussa = entrada.nextInt();
		 //agora estamos instanciando obj da classe BRINQUEDO
		 Brinquedo montanhaRussa = new Brinquedo(nomeMontanhaRussa,altmin,capacidadeMaximaMontanhaRussa);
		 // ****** instanciar o 2 brinquedo
				 System.out.println("informe os dados do visitante 1");
		 System.out.println("Nome:");
		 entrada.nextLine();
		 String nomeVisitante1 = entrada.nextLine();
		 System.out.println("Idade: ");
		 int idadeVisitante1 = entrada.nextInt();
		 System.out.println("Altura: ");
		 double alturaVisitante1 = entrada.nextDouble();
		 //instancia objeto visitante 1
		 Visitante vis1 = new Visitante();
		 Visitante visitante1 = new Visitante(nomeVisitante1, idadeVisitante1, alturaVisitante1);
		 System.out.println("Informaçoes do brinquedo:");
		 montanhaRussa.exibirInfo();
		 System.out.println("Informaçoes do visitante 1:");
		 visitante1.exibirInfo();
		 //vamos verificar se o visitante pode ou nao andar no brinquedo 
		 System.out.println("Pode andar na montanha ruusa: " + (visitante.podeAndar);
		 
		 
		 
	 }
}
