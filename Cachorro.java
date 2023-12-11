package Atividades_Caroline_Schiavo;

import java.util.Set;

public class Cachorro {
	
	//atributos
	private String nome;
	private float peso;
	private char sexo;
	private int qtdPatas;
	
	//construtor
	public Cachorro() {
		
	}
	//construtor com parametros
	public Cachorro(String nome, float peso, char sexo, int qtdPatas) {
		this.nome = nome;
		this.peso = peso;
		this.sexo = sexo;
		this.qtdPatas = qtdPatas;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//metodos
	public void latir() {
        System.out.println("O cachorro está latindo alegremente!");
    }
    public void correr() {
        System.out.println("O cachorro está correndo de felicidade!");
    }
    public void dormir() {
        System.out.println("O cachorro se cansou e está dormindo!");
    }
    public void brincar() {
        System.out.println("O cachorro está brincando com voce!");
    }
}
	
	
