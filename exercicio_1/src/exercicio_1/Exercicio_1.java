package exercicio_1;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in); 
		int na, nb, nc;
		
		System.out.println( "digite um valor para A: " );
		na = leia.nextInt(); 
		
		System.out.println( "digite um valor para B: " );
		nb = leia.nextInt(); 
		
		System.out.println( "digite um valor para C: " );
		nc = leia.nextInt(); 
		
		if ( (na + nb) > nc) 
			System.out.println("A soma de A e B é maior que C" );
		
		else if ( (na + nb) < nc) 
			System.out.println("A soma de A e B é menor que C" );
		
		else if ( (na + nb) == nc) 
			System.out.println("A soma de A e B é igual que C" );
		
		
		
		
		
		
		
	}

}
