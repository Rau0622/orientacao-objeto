package POO;
import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Dono Dono = new Dono();		
		System.out.println("Digite seu nome");
		Dono.Dono = entrada.nextLine();
		
		Dono Cachorro = new Dono();
		System.out.println("Digite o nome do seu cachorro");
		Dono.Cachorro = entrada.nextLine();
		
		Dono.idade = 3;
		Dono.raca = "Boxer";
		Dono.Sexo = 'M';
		
		Caminhar c = new Caminhar();
		c.andar(Dono);
		
	}

}
