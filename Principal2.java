package POO;

public class Principal2 {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricaçao = 2011;
		meuCarro.cor = "Azul";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Fusca";
		meuCarro.Dono = new Proprietario();
		meuCarro.Dono.nome = "Rauam";
		meuCarro.Dono.cpf = "100100100-01";
		meuCarro.Dono.idade = 18;
		meuCarro.Dono.bairro = "Alto Lage";
		meuCarro.Dono.logradouro = "Espirito Santo";
		
		Carro seuCarro = new Carro();
		seuCarro.anoDeFabricaçao = 2009;
		seuCarro.cor = "Prata";
		seuCarro.fabricante = "chevrolet";
		seuCarro.modelo = "Palio";
		seuCarro.Dono = new Proprietario();
		seuCarro.Dono.nome = "Rauam";
		seuCarro.Dono.cpf = "100100100-01";
		seuCarro.Dono.idade = 18;
		seuCarro.Dono.bairro = "Alto Lage";
		seuCarro.Dono.logradouro = "Espirito Santo";

	}

}
