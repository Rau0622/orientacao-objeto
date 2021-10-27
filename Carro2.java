package POO;

import OrBj.Proprietario;

public class Carro2 {

	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao; 
	boolean biCombustivel;
	
	Proprietario Dono;
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
	}
	
}