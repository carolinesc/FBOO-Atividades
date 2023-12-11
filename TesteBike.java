package Atividades_Caroline_Schiavo;

import java.util.Scanner;

public class TesteBike {
	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		
		SpeedBike b1 = new SpeedBike();
		SpeedBike b2 = new SpeedBike();
		MountainBike m1 = new MountainBike();
		MountainBike m2 = new MountainBike();
		PessoaBike p1 = new PessoaBike();
		
		p1.subir();
		System.out.println("Estamos na SpeedBike...");
		System.out.println("Defina sua velocidade inicial!");
		b1.setVelocidade(entrada.nextInt());
		
		System.out.println("Voce esta a " + b1.getVelocidade() + " km por hora!");
		System.out.println("Vamos acelerar! defina o valor de sua aceleracao...");
		b1.acelerar(entrada.nextInt());
		System.out.println("Voce acelerou! Agora voce esta a " + b1.getVelocidade() + " km por hora!");
		System.out.println("Precisamos trocar a marcha! Redefina a mesma...");
		b1.setMarcha(entrada.nextInt());
		System.out.println("Sua marcha agora e " + b1.getMarcha() + "!");
		System.out.println("Estamos indo muito rapido, vamos desacelerar! defina o valor de sua desaceleracao...");
		b1.desacelerar(entrada.nextInt());
		System.out.println("Voce desacelerou! Agora voce esta a " + b1.getVelocidade() + " km por hora!");
		System.out.println("O sinal esta fechado! vamos frear! informe o valor de sua velocidade atual para frear a bike!");
		b1.frear(entrada.nextInt());
		System.out.println("Voce freou! Sua bike esta a " + b1.getVelocidade() + " km por hora!");
		System.out.println("Obrigada pelo passeio!");
		System.out.println("     ");
		p1.subir();
		System.out.println("Estamos na MountainBike...");
		System.out.println("Defina sua velocidade inicial!");
		m1.setVelocidade(entrada.nextInt());
		
		System.out.println("Voce esta a " + m1.getVelocidade() + " km por hora!");
		System.out.println("Vamos acelerar! defina o valor de sua aceleracao...");
		m1.acelerar(entrada.nextInt());
		System.out.println("Voce acelerou! Agora voce esta a " + m1.getVelocidade() + " km por hora!");
		System.out.println("Precisamos trocar a marcha! Redefina a mesma...");
		m1.setMarcha(entrada.nextInt());
		System.out.println("Sua marcha agora e " + m1.getMarcha() + "!");
		System.out.println("Estamos indo muito rapido, vamos desacelerar! defina o valor de sua desaceleracao...");
		m1.desacelerar(entrada.nextInt());
		System.out.println("Voce desacelerou! Agora voce esta a " + m1.getVelocidade() + " km por hora!");
		System.out.println("O sinal esta fechado! vamos frear! informe o valor de sua velocidade atual para frear a bike!");
		m1.frear(entrada.nextInt());
		System.out.println("Voce freou! Sua bike esta a " + m1.getVelocidade() + " km por hora!");
		System.out.println("Obrigada pelo passeio!");
		
	}
}