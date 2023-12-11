package Atividades_Caroline_Schiavo;

public class Brinquedo {
	
	public String nome;
	public int idademin;
	public double altmin;
	public int capacidadem;
	
	//construtor padrao
	
	public void Brinquedo() {
		this.idademin = 14;
		this.altmin = 155.0;
		this.capacidadem = 30;

	}
	
	//Construtor com parâmetros
	
	public void Brinquedo(String nom, int capacidadem, int idademin, double altmin) {
		this.idademin = idademin;
		this.altmin = altmin;
		this.capacidadem = capacidadem;
		this.nome = nom;
		
	}
	
	//getters e setters
		
	//nome
		
	public String getNome() {
			System.out.println("o nome do brinquedo é:");
			return nome;
	}
		public void setNome(String nome) {
			this.nome = nome;
	}
		
	
		//altura
		
		public double getAltmin() {
			System.out.println("o altura mínima é:");
			return altmin;
	}
		public void setAltmin(double altmin) {
			this.altmin = altmin;
		}
		
	
		//Idade
		
		public int getIdademin() {
			System.out.println("a idade mínima é:");
			return idademin;
	}
		public void setIdademin(int idademin) {
			this.idademin = idademin;
		}
		
	//Capacidade
		
		public int getCapacidadem() {
			System.out.println("a capacidade maxima é:");
			return capacidadem;
	}
		public void setAlt(int capacidadem) {
			this.capacidadem = capacidadem;
		}
	
		// Exibir informações sobre a roda gigante

		public void exibirInformacoes() {
			System.out.println("Idade mínima: " + idademin + " anos");
			System.out.println("Altura mínima: " + altmin + " cm");
			System.out.println("Há" + capacidadem + "vagas disponíveis!");

}
}

