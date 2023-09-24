package padroesProjeto.strategy;

public class Robo {
	private Comportamento strategia;
	
	public void setComportamento(Comportamento comportamento) {
		this.strategia = comportamento;
	}
	
	public void mover() {
		strategia.mover();
	}

}
