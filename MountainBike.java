package Atividades_Caroline_Schiavo;

public class MountainBike implements Veiculo{
	//atributos
	private int velocidade;
	private int marcha;
	
	//construtor
	public MountainBike() {
		
	}
	//construtor parametros
	public MountainBike(int velocidade, int marcha) {
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	//getters e setters
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
	public String mudarMarcha() {
		return null;
		
	}
	@Override
	public void acelerar(int vel) {
		velocidade = vel + 10;
	}
	@Override
	public void frear(int vel) {
		velocidade = -10;
	}


}
