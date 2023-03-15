package aula_01;

import java.util.Scanner;

public class aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		//variaveis
		double numero1, numero2;
		String nome;
		
		System.out.println("Digite Seu Nome:");
		nome = leia.nextLine();
		System.out.println("nome:" + nome);
		
		
		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma = " + (numero1 + numero2));
		
		System.out.println("Subtração = " + (numero1 - numero2));
		
		System.out.println("Multiplicação = " + (numero1 * numero2));
		
		System.out.println("Divisão = " + (numero1 / numero2));
		
		System.out.println("Potência = " + (Math.pow(numero1, numero2)));
		
		System.out.println("Raiz = " + (Math.sqrt(numero1)));
		
		
	}
	
	

}
