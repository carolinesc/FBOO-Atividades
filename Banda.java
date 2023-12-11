package Atividades_Caroline_Schiavo;

import java.util.ArrayList;
import java.util.List;

public class Banda {
	private String nome;
	private List<MembroBanda> membros = new ArrayList<MembroBanda>();
	
	public Banda() {
		
	}
	public Banda(String nome, List<MembroBanda> membros) {
		this.nome = nome;
		this.membros = membros;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<MembroBanda> getMembros() {
		return getMembros();
	}
	public void setMembros(List<MembroBanda> membros) {
		this.membros = membros;
	}
	
	public void adicionarMembro() {
		System.out.println("adicione um novo membro no banda...");
	}
	public void realizarShow() {
		System.out.println("Vamos realizar o show...");
	}
}
