package fundamentos;

import java.util.Scanner;

public class VerificarPolindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner word = new Scanner(System.in);
		System.out.println("Escreva uma palavra:");
		String palavra = word.nextLine().trim();
		String palavraInvertida = "";
		for (int i = palavra.length() -1; i >= 0; i--) {
			
			palavraInvertida += palavra.charAt(i);
			
		}
		if (palavra.equalsIgnoreCase(palavraInvertida)) {
			
			System.out.println("A palavra " + palavra + " é um polidromo");
		} else {
			System.out.println("A palavra " + palavra + " não é um polidromo");
		}
	}

}
