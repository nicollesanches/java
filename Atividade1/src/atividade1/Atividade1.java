package atividade1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite O Salário:");
		
		salario = leia.nextFloat();
		
		System.out.println("Digite O Abono:");
		
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O valor do novo salário é: R$ " +  df.format(novoSalario));
		
		
		
		
	}

}
