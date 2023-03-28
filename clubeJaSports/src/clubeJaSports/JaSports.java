package clubeJaSports;

import java.util.Scanner;

public class JaSports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scanner = new Scanner(System.in);
	        int opcao = 0;

	        while (opcao != 6) {
	            System.out.println("Escolha uma opção:");
	            System.out.println("1 - Cadastrar novo jogador");
	            System.out.println("2 - Consultar dados de jogador");
	            System.out.println("3 - Alterar dados de jogador");
	            System.out.println("4 - Excluir jogador");
	            System.out.println("5 - Listar todos os jogadores");
	            System.out.println("6 - Sair");
	            System.out.print("Opção: ");

	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    cadastrarJogador();
	                    break;
	                case 2:
	                    consultarJogador();
	                    break;
	                case 3:
	                    alterarJogador();
	                    break;
	                case 4:
	                    excluirJogador();
	                    break;
	                case 5:
	                    listarJogadores();
	                    break;
	                case 6:
	                    System.out.println("Saindo...");
	                    break;
	                default:
	                    System.out.println("Opção inválida, tente novamente.");
	            }
	        }
	    }

	    private static void cadastrarJogador() {
	        // Lógica para cadastrar um novo jogador
	    }

	    private static void consultarJogador() {
	        // Lógica para consultar os dados de um jogador
	    }

	    private static void alterarJogador() {
	        // Lógica para alterar os dados de um jogador
	    }

	    private static void excluirJogador() {
	        // Lógica para excluir um jogador
	    }

	    private static void listarJogadores() {
	        // Lógica para listar todos os jogadores
	    	
	    	gitignore
	    }
	}