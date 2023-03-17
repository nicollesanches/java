package atividade2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		float n1, n2, n3, n4, media;

		System.out.println("Digite a 1ª nota: ");

		n1 = leia.nextFloat();

		System.out.println("Digite a 2ª nota: ");

		n2= leia.nextFloat();
		
		System.out.println("Digite a 3ª nota: ");

		n3 = leia.nextFloat();
		
		System.out.println("Digite a 4ª nota: ");

		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4) /4;
		
		System.out.println("Média Das Notas: " + media);
	}

}
