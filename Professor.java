package Atividades_Caroline_Schiavo;

public class Professor extends Pessoa{

	private String nomeCurso;
	private float salario;
	
	 //metodo construtor
		public Professor() {
			System.out.println("Insira os dados do professor:");
		}
		
		//parametro
				public Professor(String nome, String endereco, int telefone, int cpf, int celular, float salario, String nomeCurso) {
					this.nomeCurso = nomeCurso;
					this.salario = salario;
					super.nome = nome;
					super.endereco = endereco;
					super.telefone = telefone;
					super.cpf = cpf;
					super.celular = celular;
				}
				
		//metodos
		public String getNomeCurso() {
			return nomeCurso;
			
		}
		public void setNomeCurso(String nomeCurso) {
			this.nomeCurso = nomeCurso;
		}
		public float getSalario() {
			return salario;
			
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}

}
