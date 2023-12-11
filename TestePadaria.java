package Atividades_Caroline_Schiavo;
import java.util.Scanner;

public class TestePadaria {
	public static void main(String[]args) {
		double soma;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bem vindo a Padaria da Karol!" + " Adicione o nome do pao escolhido:");
		
		 Pao p1 = new Pao(); 
		 Pao p2 = new Pao();
		 p1.setNome(entrada.next());    
		 System.out.println("Agora informe o valor:");
    	 p1.setPreco(entrada.nextDouble());
    	 System.out.println("Seu primeiro pedido e um pao " + p1.getNome() + " que custa " + p1.getPreco() + "reais!" + "Faca um novo pedido de pao:") ;
    	  p2.setNome(entrada.next());
    	  System.out.println("Agora informe o valor:");
    	  p2.setPreco(entrada.nextDouble());
    	  System.out.println("Seu segundo pedido e um pao " + p2.getNome() + " que custa " + p2.getPreco() + "reais!" + "Paes sao deliciosos!" + " Agora escolha seu bolo:");
		
    	  Bolo b1 = new Bolo(); 
 		 Bolo b2 = new Bolo();
 		 b1.setNome(entrada.next());    
 		 System.out.println("Agora informe o valor:");
     	 b1.setPreco(entrada.nextDouble());
     	 System.out.println("Seu terceiro pedido e um bolo sabor " + b1.getNome() + " que custa " + b1.getPreco() + "reais!" + "Faca um novo pedido de bolo:") ;
     	  b2.setNome(entrada.next());
     	 System.out.println("Agora informe o valor:");
     	  b2.setPreco(entrada.nextDouble());
     	 System.out.println("Seu quarto pedido e um pao " + b2.getNome() + " que custa " + b2.getPreco() + "reais!" + "Bolos sao deliciosos!" + " Agora escolha seu doce:");
     	
     	 Doce d1 = new Doce(); 
 		 Doce d2 = new Doce();
 		 d1.setNome(entrada.next());    
 		 System.out.println("Agora informe o valor:");
     	 d1.setPreco(entrada.nextDouble());
     	 System.out.println("Seu quinto pedido e um " + d1.getNome() + " que custa " + d1.getPreco() + "reais!" + "Faca um novo pedido de doce:") ;
     	  d2.setNome(entrada.next());
     	 System.out.println("Agora informe o valor:");
     	 d2.setPreco(entrada.nextDouble());
     	 System.out.println("Seu sexto pedido e um " + d2.getNome() + " que custa " + d2.getPreco() + "reais!");
     	 
     	System.out.println("  ");
     	 System.out.println("Sua nota fiscal:");
     	System.out.println("1. Pao " + p1.getNome() + " - " + p1.getPreco() + " reais;");
     	 System.out.println("2. Pao " + p2.getNome() + " - " + p2.getPreco() + "reais;");
     	System.out.println("3. Bolo " + b1.getNome() +  " - " + b1.getPreco()+ "reais;");
     	System.out.println("4. Bolo " + b2.getNome() +  " - " + b2.getPreco()+ "reais;");
     	System.out.println("5. Doce " + d1.getNome() +  " - " + d1.getPreco()+ "reais;");
     	System.out.println("6. Doce " + d2.getNome() +  " - " + d2.getPreco()+ "reais;");
     	soma = p1.getPreco() + p2.getPreco() + b1.getPreco() + b2.getPreco() + d1.getPreco() + d2.getPreco();     	
     	System.out.println("O resultado da sua compra foi de " + soma + " reais!");
     	System.out.println("");
     	   	 
     	 
     	 System.out.println("Obrigada pela preferencia!"+
	     	 "Padaria da Karol agradece!" + " Agora nos ajude a anotar um pedido:");
     	System.out.println("  ");
     	 //bellis comendo
     	PessoaPadaria bellis = new PessoaPadaria();
     	bellis.comer();
     	System.out.println("Ela escolheu um pao, digite o nome do mesmo:");
     	p1.setNome(entrada.next());
     	System.out.println("Pao " + p1.getNome() + " adicionado com sucesso!");
     	System.out.println("Ela escolheu um bolo, digite o nome do mesmo:");
     	b1.setNome(entrada.next());
     	System.out.println("Bolo " + b1.getNome() + " adicionado com sucesso!");
     	System.out.println("Ela estava na duvida e escolheu dois doces, digite o nome dos mesmos:");
     	d1.setNome(entrada.next());
     	d2.setNome(entrada.next());
     	System.out.println("Doces " + d1.getNome() + " e " + d2.getNome() + " adicionados com sucesso!");
     	
     	System.out.println("  ");
    	 System.out.println("Sua nota fiscal:");
    	System.out.println("1. Pão " + p1.getNome() + " - " + p1.getPreco() + " reais;");
    	 System.out.println("2. Pão " + b1.getNome() + " - " + b1.getPreco() + "reais;");
    	System.out.println("3. Doce " + b1.getNome() +  " - " + d1.getPreco()+ "reais;");
    	System.out.println("4. Doce " + b2.getNome() +  " - " + d2.getPreco()+ "reais;");
    	System.out.println("  ");
     	bellis.opiniao();
     	
     	
     	
	}
	
}
