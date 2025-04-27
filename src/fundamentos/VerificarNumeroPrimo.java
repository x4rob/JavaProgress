package fundamentos;

import java.util.Scanner;

public class VerificarNumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero = -1;
		while (numero <= 0) {
			System.out.println("Digite um número maior que zero:");
			String entrada = scanner.nextLine();
			try {
				numero = Integer.parseInt(entrada);
				if (numero <= 0) {
					System.out.println(numero + " não é maior que zero");

				}
			} catch (NumberFormatException e) {

				System.out
						.println(entrada + " não é válido, por favor, digite apenas números inteiros maiores que zero");
			}
		}
		boolean primo = true;

		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				primo = false;
				break;
			}

		}
		if (primo) {
			System.out.println(numero + " é um número primo");

		} else {
			System.out.println(numero + " não é um número primo");
		}
		scanner.close();

	}

}
