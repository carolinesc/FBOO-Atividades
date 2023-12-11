package Atividades_Caroline_Schiavo;

import java.util.Scanner;

public class TesteCasa {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bem vindo(a) a Imobiliaria da Karol!" + " Adicione a cor da casa escolhida:");
		Casa c1 = new Casa(); 
		Casa c2 = new Casa();
		 c1.setCor(entrada.next());    
		 System.out.println("Agora informe o valor:");
   	 c1.setPreco(entrada.nextFloat());
   	 System.out.println("Qual é a metragem desejada?") ;
   	  c1.setMetragem(entrada.nextFloat());
   	  System.out.println("Agora informe se a casa tem tv...");
   	  c1.setTemTv(entrada.nextBoolean());
   	  System.out.println("Quantas camas havera?");
   	  c1.setNumeroCamas(entrada.nextInt());
   	System.out.println("Quantas camas havera?");
  
   	System.out.println("  ");
	 System.out.println("Informacoes de sua casa:");
	System.out.println("Cor: " + c1.getCor() + ";");
	System.out.println("Valor: " + c1.getPreco() + ";");
	 System.out.println("Metragem: " + c1.getMetragem() + " metros quadrados;");
	System.out.println("Qnt Camas: " + c1.getNumeroCamas() +  ";");
	System.out.println("Tv:" + c1.getTemTv() +  ";");
	System.out.println("Ficou uma casa incrível!");
	System.out.println("     "); 	
	System.out.println("Vamos escolher uma segunda opcao?");
	System.out.println("Adicione a cor da casa escolhida:");
		 
	
	c2.setCor(entrada.next());    
	 System.out.println("Agora informe o valor:");
	 c2.setPreco(entrada.nextFloat());
	 System.out.println("Qual é a metragem desejada?") ;
	  c2.setMetragem(entrada.nextFloat());
	  System.out.println("Agora informe se a casa tem tv...");
	  c2.setTemTv(entrada.nextBoolean());
	  System.out.println("Quantas camas havera?");
	  c2.setNumeroCamas(entrada.nextInt());
	  
	  System.out.println("  ");
		 System.out.println("Sua casa havera:");
		System.out.println("Cor:" + c2.getCor() + ";");
		 System.out.println("Metragem" + c2.getMetragem() + " cm;");
		 System.out.println("Tv:" + c2.getTemTv() +  ";");
		System.out.println("Qnt Camas " + c2.getNumeroCamas() +  ";");
		System.out.println("Ficou uma casa incrível!");
		System.out.println("Obrigada pela preferencia!");
   	  
	}

}
