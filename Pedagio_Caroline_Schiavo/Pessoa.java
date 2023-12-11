package Pedagio_Caroline_Schiavo;

public abstract class Pessoa {

	public String nome;
	public int idade;
	public String cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("CPF: " + cpf);
	}
	
}
