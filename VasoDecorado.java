package Atividades_Caroline_Schiavo;

public class VasoDecorado extends Vaso{
		
	//atributos
		private String decoracao;
			public VasoDecorado(String decoracao) {
			super();
			this.decoracao = decoracao;
	} public VasoDecorado() {
	}

		public String getDecoracao() {
			return decoracao;
		}
		public void setDecoracao (String decoracao) {
			this.decoracao = decoracao;

		}
		public void exibir() {
			System.out.println("O vaso é composto pela decoração de " + decoracao);
		}
}