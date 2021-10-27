package POO;

import POO.OPA2;

public class TOE2 {

	public static void main(String[] args) {
		OPA2 o1 = OPA2.ADICAO;
		
		int resultado1 = o1.operacao(5, 3);
		System.out.println("O resulado é: " + resultado1);
		
		for (OPA2 oa : OPA2.values()) {
			System.out.println(oa + " -> " + oa.operacao(4, 2));
		}
		
	}
	
}