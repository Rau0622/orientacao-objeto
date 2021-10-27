package POO;

import POO.Naipe2;

public class Carta2 {

	private int numero;
	private Naipe2 naipe;
	
	public Carta2(int numero, Naipe2 naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}
	
	public void imprimirCarta() {
		System.out.println("Sou " + numero + " de " + naipe 
				+ ". E tenho a cor "  + naipe.getCor() );
	}
}