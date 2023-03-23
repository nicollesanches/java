package collect1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio3 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		for(int contador =0; contador <10; contador++) {
			System.out.println("Digite um numero");
			numeros.add(leia.nextInt());
		
		}
		numeros.add(null);
		
		System.out.println("Listar os Elementos");
		 for(var numero: numeros)
			 System.out.println(numero);
			 
	}
	
}