package Atividades_Caroline_Schiavo;

public class ProdutoPadaria implements Produto {
	
	//atributos
	protected String nome;
	private double preco;

	//construtor padrao
	public ProdutoPadaria() {
		
	}
	//construtor com parametros
	public ProdutoPadaria(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	//metodos
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public double getPreco() {
		return preco;
	}
	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void exibir() {
		System.out.println("");
	}
	
	

}

