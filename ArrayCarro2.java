package POO;

import POO.Carro2;

public class ArrayCarro2 {

	public static void main(String[] args) {
		Carro2[] carros = new Carro2[4];
		
		carros[0] = new Carro2();
		carros[0].anoDeFabricacao = 2011;
		
		System.out.println("Ano fabricacao: " + carros[0].anoDeFabricacao);
	}

}
