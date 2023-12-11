package Atividades_Caroline_Schiavo;

public class TesteCao {

	public static void main(String[] args) {
		 Cachorro cao1 = new Cachorro("Jupiter",7,'m',4);
		 System.out.println("Vamos brincar com nosso caozinho!");
		 System.out.println("Seu nome e Jupiter, macho, pesa 5kg e possui 4 patas!");
		 System.out.println("Vamos brincar com ele!");
	        cao1.brincar();
	        cao1.correr();
	        cao1.latir();
	        cao1.dormir();
	        System.out.println("     ");
	        Cachorro cao2 = new Cachorro("Bellis",3,'f',1);
	        System.out.println("Agora vamos brincar com nossa caozinha!");
			 System.out.println("Seu nome e Bellis, femea, pesa 8kg e possui 4 patas!");
			 System.out.println("Vamos brincar com ela!");
	        cao2.brincar();
	        cao2.correr();
	        cao2.latir();
	        cao2.dormir();
	        System.out.println("     ");
	        Cachorro cao3 = new Cachorro("Cristal",7,'f',3);
	        System.out.println("E por ultimo vamos brincar com nossa caozinha!");
			 System.out.println("Seu nome e Cristal, femea, pesa 8kg e possui 4 patas!");
			 System.out.println("Vamos brincar com ela!");
	        cao3.brincar();
	        cao3.correr();
	        cao3.latir();
	        cao3.dormir();
	    }

	}

