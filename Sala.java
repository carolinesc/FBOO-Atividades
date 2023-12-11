package Atividades_Caroline_Schiavo;

public class Sala extends Comodo{
	
	//atributo
	private boolean temTv;
	
	//c
	public Sala() {
		
	}
	public Sala(boolean temTv) {
		this.temTv = temTv;
	}
	
	public boolean getTemTv() {
		return temTv;
	}
	public void setTemTv(boolean temTv) {
		this.temTv = temTv;
}
	public void TemTv() {
		if(temTv == true) {
			System.out.println("Tem tv!");
		}
		else {
			System.out.println("Nao tem tv...");
			
		}
		return;

	
}
	}
	

