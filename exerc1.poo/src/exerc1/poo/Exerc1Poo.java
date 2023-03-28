package exerc1.poo; 

import java.util.Scanner;

public class Exerc1Poo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientePoo dados = new ClientePoo("Nicolle Sanches", 21, "Rua oswaldo barbosa", "nicollesanches.ri@outlook.com", "Eliane Sanches");	
		ClientePoo dados2 = new ClientePoo("Kauan Manoel", 22, "Rua Esperidião castiel", "kauanmanoel.ri@outlook.com", "Marilene Xavier");
		PessoaFisica dados3 = new PessoaFisica ("Vanessa menezes", 28, "Rua jefferson gomesr", "vanessamnzsi@outlook.com", "jessica silva", "solteira");
		PessoaFisica dados4 = new PessoaFisica ("Nathalia Sanches", 42, "Rua guaratubar", "nathsanxsi@outlook.com", "Eliane aparecida", "solteira");
		PessoaJuridica dados5 = new PessoaJuridica("Marcos Ribeiro", 50, "rua pedro alves", "marcosri@outlook.com", "Maria ribeiro", "84839483445");
		PessoaJuridica dados6 = new PessoaJuridica("Eliane santos", 22, "Rua pacheco netto", "elianesantos@outlook.com", "natalina santos", "8238398239");
		dados.visualizar();
		
		dados2.visualizar();
		
		dados3.visualizar();
		
		dados4.visualizar();
		
		dados5.visualizar();
		
		dados6.visualizar();
		
		
		
	}

}
