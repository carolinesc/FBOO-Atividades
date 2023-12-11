package Atividades_Caroline_Schiavo;

public class Pessoa {
	
	//atributos
	
	protected String nome;
	protected String endereco;
	protected int telefone;
	protected int cpf;
	protected int celular;
	
	//construtor
		
	
		public Pessoa() {
			System.out.println("Bem Vindo Pessoa" + nome + "!");
		}
		public void metodoImprimir() {
			System.out.println("Imprimi na Pessoa");
		}
		
	//parametros
		
		public Pessoa(String nome, String endereco, int telefone, int cpf, int celular) {
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
			this.cpf = cpf;
			this.celular = celular;
		}
		
		
	//getter e setters
		public void setNome (String nome) {
			this.nome = nome;
			
		}
		public String getNome() {
			return nome;
		}
		public void setEndereco (String endereco) {
			this.endereco = endereco;
			
		}
		public String getEndereco() {
			return endereco;
		}
		public void setTelefone (int telefone) {
			this.telefone = telefone;
			
		}
		public int getTelefone() {
			return telefone;
		}
		public void setCpf (int cpf) {
			this.cpf = cpf;
			
		}
		public int getCpf() {
			return cpf;
		}
		public void setCelular (int celular) {
			this.celular = celular;
			
		}
		public int getCelular() {
			return celular;
		}
	
}
