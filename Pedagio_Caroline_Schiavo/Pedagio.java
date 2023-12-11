package Pedagio_Caroline_Schiavo;

public class Pedagio {

	public Funcionario funcionario;
	public Cliente cliente;
	public float valorPorEixo;
	public String formaDePagamento;
	
	public Pedagio() {
		
	}
	public Pedagio(Funcionario funcionario, Cliente cliente, float valorPorEixo, String formaDePagamento) {
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.valorPorEixo = valorPorEixo;
		this.formaDePagamento = formaDePagamento;
		
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getValorPorEixo() {
		return valorPorEixo;
	}
	public void setValorPorEixo(float valorPorEixo) {
		this.valorPorEixo = valorPorEixo;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	public void pagamento() {
		System.out.println("Estou pagando...");
	
	}
}
