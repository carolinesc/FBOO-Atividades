package Atividades_Caroline_Schiavo;

public class Visitante {

	public String nome;
	private int idade;
	private double alt;
	private Int string;
	private Int idade2;

	// Construtor parâmetros

    public Visitante(int idade, double alt, String nome) {

        this.nome = nome;

        this.idade = idade;

        this.alt = alt;

    }
    
    // Getters e setters

    //Idade
    
    public int getIdade() {
    	return idade;

    }
    public void setIdade(Int idade) {
		this.idade = idade;

    }

    //Alturas
 

    public double getAlt() {

        return alt;

    }
    public void setAltura(double alt) {

        this.alt = alt;

    }
    public boolean condicao;
    public double altmin;
    public void podeAndar() {
    	if (idade < 14 || alt < altmin) {
    	condicao = true;
    	
    	}
    	else {
    		condicao = false;
    	}
    }

}