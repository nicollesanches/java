package collect1;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	

		public static void main(String[] args) {
			
			Stack<String> pilhaLivros = new Stack<String>();
			
			Scanner leia = new Scanner(System.in);
			
			int opcao = 0;
			String livro = "";
			
			do {			
				System.out.println("----------------------------------------");
				System.out.println("1 - Adicionar um novo livro na pilha");
				System.out.println("2 - Listar todos os  livros da Pilha");
				System.out.println("3 - Retirar um livro da pilha");
				System.out.println("0 - Finalizar programa\n");
				System.out.println("Entre com a opção desejada: ");
				
				opcao = leia.nextInt();
				
				switch (opcao) {
				
				case 1:
					System.out.println("----- Adicionar um novo livro ----- ");
					System.out.println("Digite o nome do livro: ");
					
					livro = leia.next();
					pilhaLivros.push(livro);

					System.out.println("Livro Adicionado! \n");
					break;
					
				case 2:
					System.out.println("----- Listagem de Livros ----- ");
					
					for(var elemento : pilhaLivros)
						System.out.println(elemento);
									
					break;
					
				case 3:
					
					if (pilhaLivros.isEmpty()) {
						System.out.println("A Pilha está vazia!");}
					
					else {
						String LivrosRemovidos = pilhaLivros.pop();
					
					
					
					System.out.println("O livro" + LivrosRemovidos +  "foi retirado! \n");}
					break;
					

				default:
					if (opcao > 3)
					System.out.println("Opção invalida \n");
					break;
				}
				
			} while (opcao != 0);
			
			
				
			System.out.println("Programa finalizado! ");

			leia.close();

		}

	}