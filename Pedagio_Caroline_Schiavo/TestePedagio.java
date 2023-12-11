package Pedagio_Caroline_Schiavo;

import java.util.Scanner;

public class TestePedagio {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		System.out.println("Bem vindo ao pedagio Boa Viagem!");
		System.out.println("    ");
		System.out.println("Coletando informacoes do seu veiculo...");
		System.out.println("    ");
		Funcionario funcio = new Funcionario();
		Veiculo v1 = new Veiculo();
		System.out.println("Insira o modelo:");
		v1.setModelo(entrada.next());
		System.out.println("Insira a quantidade de rodas:");
		v1.setQuantidadeRodas(entrada.nextInt());
		System.out.println("    ");
		v1.exibirInfo();
		Cliente cli1 = new Cliente();
		System.out.println("    ");
		funcio.cobrar();
		cli1.setQuantidadeDinheiro(entrada.nextInt());
		funcio.exibir(); System.out.println(cli1.getQuantidadeDinheiro());
		cli1.setTroco(cli1.getQuantidadeDinheiro() - 6);
		System.out.println("Voce rebeceu " + cli1.getTroco() + " reais de troco!");
		System.out.println("Obrigada! Tenha uma boa viagem!");
	}

}
