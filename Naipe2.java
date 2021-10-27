package POO;

public enum Naipe2 {

	OURO("Vermelho"),
	PAUS("Preto"),
	ESPADA("Preto"),
	COPAS("Vermelho");
	
	Naipe2(String cor) {
		this.cor = cor;
	}
	
	private String cor;
	
	public String getCor() {
		return cor;
	}
		
}