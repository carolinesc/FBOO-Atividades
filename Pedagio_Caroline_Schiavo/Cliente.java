package Pedagio_Caroline_Schiavo;

public class Cliente extends Pessoa {
	public float quantidadeDinheiro;
	public Veiculo veiculo;
	public double troco;
	public Cliente() {
		
	}
	public Cliente(float quantidadeDinheiro, Veiculo veiculo) {
		this.quantidadeDinheiro = quantidadeDinheiro;
		this.veiculo = veiculo;
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}
	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}
	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}
	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}
	public float getQuantidadeDinheiro() {
		return quantidadeDinheiro;
	}
	public void setQuantidadeDinheiro(float quantidadeDinheiro) {
		this.quantidadeDinheiro = quantidadeDinheiro;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public double getTroco() {
		return troco;
	}
	public void setTroco(double troco) {
		this.troco = troco;
	}

	public void pagar() {
		System.out.println("Estou pagando...");
	}
	public void exibir() {
		System.out.println("Estou pagando...");
	}
}
