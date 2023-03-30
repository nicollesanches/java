package clubeJaSports;

import java.util.Scanner;

public class JaSports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        
        System.out.println("Opções de esporte: ");
        System.out.println("Futebol, Vôlei, Basquete e Boxe");
        System.out.println("A seguir, escolha seu plano:");
        
        
        do { 
            System.out.println("\tEscolha um plano: ");
            System.out.println("1 - Pacote Mensal Basic Todos os Esportes $60,00");
            System.out.println("2 - Pacote Mensal Premiun Todos os Esportes + treinador $100,00");
            System.out.println("3 - Pacote Anual Basic Todos os Esportes (desconto de 15%) $612,00");
            System.out.println("4 - Pacote Anual Premiun Todos os Esportes + treinador (desconto de  20%) $960,00");
            System.out.println("5 - Sair");
            
            
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                	
                    System.out.println("Você escolheu o Pacote Mensal Basic Todos os Esportes.");
                    break;
                case 2:
                    System.out.println("Você escolheu o Pacote Mensal Premiun Todos os Esportes + treinador.");
                    break;
                case 3:
                    System.out.println("Você escolheu o Pacote Anual Basic Quadra (desconto de 15%).");
                    break;
                case 4:
                    System.out.println("Você escolheu o Pacote Anual Premiun Quadra (desconto de  20%).");
                    break;
                case 5:
                    System.out.println("Encerrado.");
                    break;
     
                default:
                    System.out.println("Esporte inválido.");
                    break;
            }
        } while (escolha != 5);

        sc.close();
    }
}