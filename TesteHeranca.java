package Atividades_Caroline_Schiavo;

import java.util.Scanner;

public class TesteHeranca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		//instanciar obj classe aluno
		Aluno a1 = new Aluno();
		a1.setNome(entrada.next());
		a1.setEndereco(entrada.next());
		a1.setTelefone(entrada.nextInt());
		a1.setCpf(entrada.nextInt());
		a1.setCelular(entrada.nextInt());
		a1.setCurso(entrada.next());
		a1.setNota1(entrada.nextInt());
		a1.setNota2(entrada.nextInt());
		a1.calcularmedia();
		
		Aluno a2 = new Aluno();
		a2.setNome(entrada.next());
		a2.setEndereco(entrada.next());
		a2.setTelefone(entrada.nextInt());
		a2.setCpf(entrada.nextInt());
		a2.setCelular(entrada.nextInt());
		a2.setCurso(entrada.next());
		a2.setNota1(entrada.nextInt());
		a2.setNota2(entrada.nextInt());
		a2.calcularmedia();

		Professor p1 = new Professor();
		p1.setNome(entrada.next());
		p1.setEndereco(entrada.next());
		p1.setTelefone(entrada.nextInt());
		p1.setCpf(entrada.nextInt());
		p1.setCelular(entrada.nextInt());
		p1.setNomeCurso(entrada.next());
		p1.setSalario(entrada.nextFloat());
		
		Professor p2 = new Professor();
		p2.setNome(entrada.next());
		p2.setEndereco(entrada.next());
		p2.setTelefone(entrada.nextInt());
		p2.setCpf(entrada.nextInt());
		p2.setCelular(entrada.nextInt());
		p2.setNomeCurso(entrada.next());
		p2.setSalario(entrada.nextFloat());
		
		System.out.println("dados dos alunos:");
		System.out.println("Aluno 1:");
		System.out.println("Nome:" + a1.getNome());
		System.out.println("Endereco:" + a1.getEndereco());
		System.out.println("Telefone:" + a1.getTelefone());
		System.out.println("Cpf:" + a1.getCpf());
		System.out.println("Celular:" + a1.getCelular());
		System.out.println("curso: " + a1.getCurso());
		a1.situacaoAluno();
		System.out.println("media: " + a1.media);
		
		System.out.println("dados dos alunos:");
		System.out.println("Aluno 2:");
		System.out.println("Nome:" + a2.getNome());
		System.out.println("Endereco:" + a2.getEndereco());
		System.out.println("Telefone:" + a2.getTelefone());
		System.out.println("Cpf:" + a2.getCpf());
		System.out.println("Celular:" + a2.getCelular());System.out.println("curso: " + a2.getCurso());
		a2.situacaoAluno();
		System.out.println("media: " + a2.media);
		
		System.out.println("dados dos Professores:");
		System.out.println("Professor 1:");
		System.out.println("Nome:" + p1.getNome());
		System.out.println("Endereco:" + p1.getEndereco());
		System.out.println("Telefone:" + p1.getTelefone());
		System.out.println("Cpf:" + p1.getCpf());
		System.out.println("Celular:" + p1.getCelular());
		System.out.println("curso: " + p1.getNomeCurso());
		System.out.println("Salario " + p1.getSalario());
		
		System.out.println("dados dos Professores:");
		System.out.println("Professor 2:");
		System.out.println("Nome:" + p2.getNome());
		System.out.println("Endereco:" + p2.getEndereco());
		System.out.println("Telefone:" + p2.getTelefone());
		System.out.println("Cpf:" + p2.getCpf());
		System.out.println("Celular:" + p2.getCelular());
		System.out.println("curso: " + p2.getNomeCurso());
		System.out.println("Salario: " + p2.getSalario());
		
	}
	

}
