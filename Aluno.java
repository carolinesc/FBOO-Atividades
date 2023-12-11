package Atividades_Caroline_Schiavo;

public class Aluno extends Pessoa {
	
	
	 private String curso;
	 private float nota1;
	 private float nota2;
	 
	
	 //metodo construtor
		public Aluno() {
			System.out.println("Insira os dados do aluno:");

		}
		//parametro
		public Aluno(String nome, String endereco, int telefone, int cpf, int celular, float nota1, String curso, float nota2) {
			this.curso = curso;
			this.nota1 = nota1;
			this.nota2 = nota2;
			super.nome = nome;
			super.endereco = endereco;
			super.telefone = telefone;
			super.cpf = cpf;
			super.celular = celular;
		}
		
		
		
		
		//metodos
		public String getCurso() {
			return curso;
			
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public float getNota1() {
			return nota1;
			
		}
		public void setNota1(float nota1) {
			this.nota1 = nota1;
		}
		public float getNota2() {
			return nota2;
			
		}
		public void setNota2(float nota2) {
			this.nota2 = nota2;
		}
		// calcula a média
		public float media;
		public void calcularmedia() {
            media = (nota1 + nota2) / 2;            
        }
		// mostra a nota do aluno
        public void situacaoAluno() {
        if(media >= 6){
            System.out.println("Você passou!");
        } else {
            System.out.println("Você reprovou!");
       }
        }
}

