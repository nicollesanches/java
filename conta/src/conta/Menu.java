package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in); 
		
		int opcao, numero, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
	Conta c1 = new Conta(1, 123, 1, "Nicolle Sanches", 100000.00f); 
		
		c1.visualizar();
		
		System.out.println("Saldo da conta: " + c1.getSaldo()); 
		
		c1.setTitular("Nicolle Sanches Ribeiro"); 
		
		c1.visualizar(); 
		
		c1.sacar(200000.0f);
		c1.visualizar(); 
		
		c1.depositar(2000.0f);
		c1.visualizar(); 
		
		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUN + "****************************************************");
			System.out.println("                                                     ");
			System.out.println("                       NUBANKZINHO			         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                 					"+ Cores.TEXT_RESET             );
																					

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nNubankzinho - Sempre com você");
				leia.close();
				sobre ();
				System.exit(0);
			}

			int agencia;
			String titular1;
			int tipo1;
			float saldo1;
			float limite1;
			int aniversario1;
			int numero1;
			float valor1;
			switch (opcao) {
			case 1 -> {
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular1 = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo1 = leia.nextInt();
				} while (tipo1 < 1 && tipo1 > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo1 = leia.nextFloat();

				switch (tipo1) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite1 = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario1 = leia.nextInt();

					// criar o objeto conta poupanca
				}
				}
			}
			case 2 -> {
				System.out.println("Digite o número da conta: ");
				aniversario1 = leia.nextInt();
			}

			case 3 -> {
				System.out.println("Digite o número da conta: ");
				numero1 = leia.nextInt();

				// criar o objeto conta poupanca
			}
			case 4 -> {
				System.out.println("Digite o número da conta: ");
				numero1 = leia.nextInt();

				tipo1 = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular1 = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo1 = leia.nextFloat();

				// retornar tipo

				switch (tipo1) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite1 = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario1 = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");
				}
				}

			}

			case 5 -> {
				System.out.println("Digite o número da conta: ");
				numero1 = leia.nextInt();
			}
			case 6 -> {
				System.out.println("Depósito\n\n ");
				
				System.out.println("Digite o número da conta: ");
				numero1 = leia.nextInt();
				
				System.out.println("Digite o valor do saque: ");
				valor1 = leia.nextFloat();
			}
			case 7 -> {
				System.out.println("Depósito\n\n ");
				
				System.out.println("Digite o número da conta: ");
				numero1 = leia.nextInt();
				
				System.out.println("Digite o valor do deposito: ");
				valor1 = leia.nextFloat();
			}
			case 8 -> {
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero1 = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				int numeroDestino1 = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor1 = leia.nextFloat();
				} while (valor1 <= 0);
			}

			}
			
		}
	}
	private static void visualizar() {
		// TODO Auto-generated method stub
		
	}
	public static void sobre () {
		System.out.println("Nicolle Sanches Ribeiro \n nicollesanches.ri@outlook.com\n https://github.com/nicollesanches"); 
		
	}
}                                         
	