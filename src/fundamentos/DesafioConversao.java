package fundamentos;

import java.util.Scanner;
import java.lang.System;

public class DesafioConversao {
	public static void main(String[] args) {
	Scanner entrada =  new Scanner(System.in);
	System.out.print("Digite o primeiro salário: ");
	String salario1 = entrada.nextLine().replace(",", ".").trim();
	System.out.println("Digite o segundo salário: ");
	String salario2 = entrada.nextLine().replace(",", ".").trim();
	System.out.println("Digite o terceiro salário: ");
	String salario3 = entrada.nextLine().replace(",", ".").trim();
	
	double valor1 = Double.parseDouble(salario1);
	
	double valor2 = Double.parseDouble(salario2);

	double valor3 = Double.parseDouble(salario3);
	
	double media = (valor1 + valor2 + valor3) / 3;
	System.out.println("A soma dos salários é: " + media);
	
	entrada.close();
	
}

}
