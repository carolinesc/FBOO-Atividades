package Atividades_Caroline_Schiavo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Banda b1 = new Banda(); 
		System.out.println("nome da sua banda:");
		b1.setNome(entrada.next());
		Vocalista v1 = new Vocalista();
		System.out.println("nome do vocalista:");
		v1.setNome(entrada.next());
		Guitarrista g1 = new Guitarrista();
		System.out.println("nome do guitarrista");
		g1.setNome(entrada.next());
		Baterista ba1 = new Baterista();
		System.out.println("nome do baterista");
		ba1.setNome(entrada.next());
		Baxista bax1 = new Baxista();
		System.out.println("nome do baxista");
		bax1.setNome(entrada.next());
		
	   //instanciando lista
		List<MembroBanda> membros = new ArrayList<MembroBanda>();
		membros.add(v1);
		membros.add(g1);
		membros.add(ba1);
		membros.add(bax1);
		for(MembroBanda olho : membros) {
			System.out.println("Integrantes da banda: " + olho.getNome());
			
		}
			
 }
}
