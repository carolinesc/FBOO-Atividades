package Atividades_Caroline_Schiavo;

public class Vocalista extends MembroBanda {
	
	public Vocalista() {
		
	}
	
	public Vocalista(String nome) {
		super.setNome(nome);
	}
	
	@Override
	public String getNome() {
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}
	public void tocar() {
		System.out.println("Cantando...");
	}
	
}
