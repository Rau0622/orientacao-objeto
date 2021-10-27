package POO;

import POO.Carta2;
import POO.Naipe2;

public class TesteEnum2 {

	public static void main(String[] args) {
		Carta2 quatroPaus = new Carta2(4, Naipe2.PAUS);
		
		quatroPaus.imprimirCarta();
	}
	
}