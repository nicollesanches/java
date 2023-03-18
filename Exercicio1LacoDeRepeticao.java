import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeroInicial, numeroFinal;

		System.out.println("Informe o in�cio do Intervalo: ");
		numeroInicial = leia.nextInt();

		System.out.println("Informe o final do Intervalo: ");
		numeroFinal = leia.nextInt();

		if (numeroInicial > numeroFinal) {
			System.out.println("Intervalo inv�lido!");
			System.exit(0);
		}

		for (int contador = numeroInicial; contador <= numeroFinal; contador++) {

			if (contador % 3 == 0 && contador % 5 == 0)
				System.out.println(contador + " � m�ltiplo de 5 e 3");
		}

	}

}
