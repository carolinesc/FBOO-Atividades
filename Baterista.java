package Atividades_Caroline_Schiavo;

public class Baterista extends MembroBanda {
	public Baterista() {
		
	}
	
	public Baterista(String nome) {
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
