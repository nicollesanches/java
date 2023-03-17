package atividade4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite O 1º Número");
		n1 = leia.nextFloat();
		
		System.out.println("Digite O 2º Número");
		n2 = leia.nextFloat();

		System.out.println("Digite O 3º Número");
		n3 = leia.nextFloat();
		
		System.out.println("Digite O 4º Número");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("O resultado é: " + diferenca);
	}

}
