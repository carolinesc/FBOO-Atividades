package Atividades_Caroline_Schiavo;

public class Vaso {

	//atributos
	
		private String cor;
		public double tamanho;
		public String material;
		
		//metodo construtor
		
		public Vaso() {
			super();
			System.out.println("OBJETO vaso acabou de ser fabricado");
		}
		//metodos
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public double getTamanho() {
			return tamanho;
		}
		public void setTamanho(double tamanho) {
			this.tamanho = tamanho;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public void exibir() {
			System.out.println("O vaso da cor" + cor + ", seu material é" + material + "e seu tamanho é de " + tamanho + "cm");
		}
		public String getDecoracao() {
			// TODO Auto-generated method stub
			return null;
		}

		}

