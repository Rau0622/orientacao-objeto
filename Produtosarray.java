package POO;
import java.util.Scanner;

public class Produtosarray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] Produtos = new String[4];
		Produtos[0] = "Prego";
		Produtos[1] = "Martelo";
		Produtos[2] = "Sera";
		Produtos[3] = "Porca";
		
		float[] Preco = new float[4];
		Preco[0] = (float) 4.30;
		Preco[1] = (float) 10.50;
		Preco[2] = (float) 8.25;
		Preco[3] = (float)2.70;
		
		System.out.println("Bem vindo a loja o que vc gostaria de comprar: ");
		
		int x = 1;
		for (int i = 0; i < 4; i++) {
			System.out.println("\n" + x++ + " " + Produtos[i]);}
		
		int R = entrada.nextInt();
			
			switch (R) {
			case 1:
				System.out.println("O " + Produtos[0]+ " esta por R$:" + Preco[0]);
				break;
			case 2:
				System.out.println("O "+Produtos[1] +" esta por R$:" +Preco[1]);
				break;
			case 3:
				System.out.println("A " + Produtos[2] +" esta por R$:" +Preco[2]);
				break;
			case 4:
				System.out.println("A " + Produtos[3] +" esta por R$:" +Preco[3]);
				break;
			default:{
				System.out.println("Produto não identificado");
				}
			}	
	}

}
