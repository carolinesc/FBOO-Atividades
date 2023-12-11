package Pedagio_Caroline_Schiavo;

public class Funcionario extends Pessoa{

	public float salario;
	public String cargo;
	public Cliente troco;
	
	public Funcionario() {
		
	}
	
	public Funcionario(float salario, String cargo) {
		this.salario = salario;
		this.cargo = cargo;
	}
	
	@Override
	public String getNome() {
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}
	@Override
	public int getIdade() {
		return super.getIdade();
	}
	@Override
	public void setIdade(int idade) {
		super.setIdade(idade);
	}
	@Override
	public String getCpf() {
		return super.getCpf();
	}
	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void cobrar() {
		System.out.println("Boa tarde! A passagem e 6 reais! Adicione o valor que você irá pagar: ");
	}
	public void exibir() {
		System.out.println("O valor pago foi de: ");
	}
	
	public int num1 = 6;

  

}
