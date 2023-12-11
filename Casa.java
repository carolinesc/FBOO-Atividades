package Atividades_Caroline_Schiavo;

public class Casa {
	private String cor;
	private float preco;
	private float metragem;
	private int numeroCamas;
	private boolean temTv;
	//c
	public Casa() {
		
	}
	//c p
	public Casa(String cor, float preco, float metragem, int numeroCamas, boolean temTv ) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.numeroCamas = numeroCamas;
		this.temTv = temTv;
	}
	//g e s
	public int getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	public boolean getTemTv() {
		return temTv;
	}
	public void setTemTv(boolean temTv) {
		this.temTv = temTv;
	}
	
	//m
	public void motrarDetalhes() {
		System.out.println("Preco" + preco);
		System.out.println("Cor" + cor);
		System.out.println("Metragem" + metragem);
		System.out.println("Numero de camas" + numeroCamas);

	}

	
}
