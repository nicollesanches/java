import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double num, positivo = 0;
		int cont = 0;

		do {
			System.out.println("Digite um n�mero");
			num = ent.nextDouble();

			if (num >= 0 && num > 0) {
				positivo = num + positivo;
				cont++;
			}

		} while (num >= 0);

		System.out.println("A soma � " + positivo);
		System.out.println("A quantidade de n�meros positivos foi " + cont);

	}

}
