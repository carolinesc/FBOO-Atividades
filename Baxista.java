package Atividades_Caroline_Schiavo;

public class Baxista extends MembroBanda {
public Baxista() {
		
	}
	
	public Baxista(String nome) {
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
