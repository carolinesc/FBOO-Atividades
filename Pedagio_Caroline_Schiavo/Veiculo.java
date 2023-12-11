package Pedagio_Caroline_Schiavo;

public class Veiculo {
	
	public int quantidadeRodas;
	public String modelo;
	
	public Veiculo() {
		
	}
	public Veiculo(int quantidadeRodas, String modelo) {
		this.quantidadeRodas = quantidadeRodas;
		this.modelo = modelo;
	}
	
	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}
	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void exibirInfo() {
		System.out.println("O numero de rodas de seu veiculo e: " + quantidadeRodas);
		System.out.println("O modelo de seu veiculo e: " + modelo);
	}
	
}
