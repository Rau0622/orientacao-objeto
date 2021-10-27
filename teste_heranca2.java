package POO;

import POO.jogador2;
import POO.tecnico2;

public class teste_heranca2 {

	public static void main(String[] args) {
		jogador2 j = new jogador2();
		j.nome = "Rauam";
		j.idade = 18;
		j.SeApresentar();
		j.dizersejoga();
		tecnico2 t = new tecnico2();
		t.nome = "Rulian";
		t.idade = 37;
		t.SeApresentar();
		t.dizersejoga();
	}

}
