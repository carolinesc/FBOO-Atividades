package Atividades_Caroline_Schiavo;

public class Guitarrista extends MembroBanda{
	
	public Guitarrista() {
		
	}
	
	public Guitarrista(String nome) {
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
		System.out.println("Tocando guitarra...");
	}
	
}
