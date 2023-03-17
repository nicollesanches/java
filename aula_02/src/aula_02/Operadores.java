package aula_02;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 2, n2 = 2, n3 = 5;
		
		
		System.out.println("variável n1: " + n1);
		System.out.println("variável n1: " + (++ n1));
		
		System.out.println("Variável n2: " + n2);
		System.out.println("variável n2: " + (n2 ++));
		System.out.println("Variável n2: " + n2);
		
		System.out.println("Variável n2: " + (n2 += 2));
		System.out.println("Variável n2: " + (n2 *= 3));
	}

}
