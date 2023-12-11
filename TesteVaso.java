package Atividades_Caroline_Schiavo;

import java.util.Scanner;

public class TesteVaso {

	public static void main(String[] args) {
				Scanner entrada = new Scanner (System.in);
				//obj1 simples
				Vaso ceramica = new Vaso();
				System.out.println("Qual é a cor, tamanho e material de seu vaso?");
				String cors = entrada.nextLine();
				ceramica.setCor(cors);
				System.out.println("Tem a cor" + ceramica.getCor());
				double tamanhos = entrada.nextDouble();
				ceramica.setTamanho(tamanhos);
				System.out.println("Tem tamanho " + ceramica.getTamanho());
				String materials = entrada.next();
				ceramica.setMaterial(materials);
				System.out.println("Seu material é" + ceramica.getMaterial());
				
				
				//obj2 simples
				Vaso simples = new Vaso();
				System.out.println("Qual é a cor, tamanho e material de seu vaso?");
				String cores = entrada.nextLine();
				ceramica.setCor(cores);
				System.out.println("Tem a cor" + simples.getCor());
				double tamanhoss = entrada.nextDouble();
				simples.setTamanho(tamanhoss);
				System.out.println("Tem tamanho " + simples.getTamanho());
				String materialss = entrada.next();
				simples.setMaterial(materialss);
				System.out.println("Seu material é" + simples.getMaterial());
				
				
				
				//vaso decorado
				VasoDecorado elaborado = new VasoDecorado();
				System.out.println("Qual é a cor, tamanho, material e decoração de seu vaso?");
				String corr = entrada.nextLine();
				elaborado.setCor(corr);
				System.out.println("Tem a cor" + elaborado.getCor());
				double tamanhoo = entrada.nextDouble();
				ceramica.setTamanho(tamanhos);
				System.out.println("Tem o tamanho" + elaborado.getTamanho());
				String materials2 = entrada.nextLine();
				elaborado.setMaterial(materials);
				System.out.println("Foi feito de  " + elaborado.getMaterial());
				String decoracoes = entrada.next();
				elaborado.setDecoracao(decoracoes);
				System.out.println("Tem a decoração de " + ceramica.getDecoracao());
	
			}
		}

	
