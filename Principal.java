package POO;

public class Principal {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabrica�ao = 2011;
		meuCarro.cor = "Azul";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Fusca";
		
		System.out.println("Meu carro");
		System.out.println("Modelo: "+ meuCarro.modelo);
		System.out.println("Ano de Fabrica�ao: "+ meuCarro.anoDeFabrica�ao);
		System.out.println("Cor: "+ meuCarro.cor);
		System.out.println("Fabricante: "+ meuCarro.fabricante);
		
		System.out.println("----------------------------------------");
		Carro seuCarro = new Carro();
		seuCarro.anoDeFabrica�ao = 2009;
		seuCarro.cor = "Prata";
		seuCarro.fabricante = "chevrolet";
		seuCarro.modelo = "Palio";
		
		System.out.println("Seu carro");
		System.out.println("Modelo: "+ seuCarro.modelo);
		System.out.println("Ano de Fabrica�ao: "+ seuCarro.anoDeFabrica�ao);
		System.out.println("Cor: "+ seuCarro.cor);
		System.out.println("Fabricante: "+ seuCarro.fabricante);

	}

}
