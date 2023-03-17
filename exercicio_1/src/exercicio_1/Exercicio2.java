package exercicio_1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in); 
		 float cq = 10, xs = 15, xb = 18, bau = 12, ref = 8, suc = 13;
		 
		 int opcao, quantidade;
		 
		 
		 System.out.println("Produtos \t Preço");
		 System.out.println("-----------------------------------------");
		 System.out.println("1\t Cachorro Quente \t 10,00");
		 System.out.println("2\tX-Salada \t\t 15,00");
		 System.out.println("3\tX-bacon \t\t 18,00");
		 System.out.println("4\tBauru \t\t\t 12,00");
		 System.out.println("5\tRefrigerante \t\t 8,00");
		 System.out.println("6\tSuco de laranja \t 13,00");
		 System.out.println("-----------------------------------------");
		 System.out.println("Escolha um Produto: ");
		 opcao = leia.nextInt(); 
	
		  System.out.println("Digite a quantidade: ");
		  quantidade = leia.nextInt();
		 
		  switch (opcao) { 
		  
		  case 1:
		  System.out.println("Você pediu " + quantidade + " Cachorro-Quente, o valor total ficou: R$" + (quantidade * cq));
		  break; 
		  
		  case 2:
			  System.out.println("Você pediu " + quantidade + " X-salada, o valor total ficou: R$" + (quantidade * xs));
			  break; 
			  
		  case 3:
			  System.out.println("Você pediu " + quantidade + " X-bacon, o valor total ficou: R$" + (quantidade * xb));
			  break; 
			  
		  case 4:
			  System.out.println("Você pediu " + quantidade + " Bauru, o valor total ficou: R$" + (quantidade * bau));
			  break; 
			  
		  case 5:
			  System.out.println("Você pediu " + quantidade + " Refrigerante, o valor total ficou: R$" + (quantidade * ref));
			  break; 
			  
		  case 6:
			  System.out.println("Você pediu " + quantidade + " Suco de laranja, o valor total ficou: R$" + (quantidade * suc));
			  break; 
		  
		  }
	}

}
