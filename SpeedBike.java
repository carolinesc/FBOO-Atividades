package Atividades_Caroline_Schiavo;

public class SpeedBike implements Veiculo {
	//atributos
	private int velocidade;
	private int marcha;
	
	//construtor
	public SpeedBike() {
		
	}
	//construtor com parametro 
	public SpeedBike(int velocidade, int marcha) {
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	//getter e setters
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	//metodos
	public void estado() {
	
	}
	@Override
	public void acelerar(int vel) {
		velocidade = velocidade + vel;
	}
	@Override
	public void desacelerar(int vel) {
		velocidade = velocidade - vel;
	}
	@Override
	public void frear(int vel) {
		velocidade = velocidade - vel;
	}
	@Override
	public void mudarMarcha() {
		System.out.println("Qual e sua marcha desejada?");
		
		if (marcha > 5) {
			System.out.println("Marcha Inválida!");
		}
	}

	

	}
