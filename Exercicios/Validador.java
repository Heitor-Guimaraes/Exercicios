package Exercicios;

import java.util.Scanner;

public class Validador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();

		boolean temMaiuscula = false;
		boolean temPrimo = false;
		boolean temEspecial = false;
		boolean vogaisDuplicadas = false;

		String especiais = "!@#$%^&*()_+-=[]{}|;':\",.<>/?";
		String vogais = "aeiouAEIOU";
		String primos = "2357";

		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if (Character.isUpperCase(c)) {
				temMaiuscula = true;
			}
			if (primos.indexOf(c) != -1) {
				temPrimo = true;
			}
			if (especiais.indexOf(c) != -1) {
				temEspecial = true;
			}
		}

		for (int i = 0; i < senha.length() - 1; i++) {
			char atual = senha.charAt(i);
			char proximo = senha.charAt(i + 1);
			if (vogais.indexOf(atual) != -1 && atual == proximo) {
				vogaisDuplicadas = true;
				break;
			}
		}

		System.out.println("\nValidação da senha:");

		if (!temMaiuscula) {
			System.out.println("- A senha deve conter pelo menos uma letra maiúscula.");
		}
		if (!temPrimo) {
			System.out.println("- A senha deve conter pelo menos um número primo (2, 3, 5 ou 7).");
		}
		if (!temEspecial) {
			System.out.println("- A senha deve conter pelo menos um caractere especial.");
		}
		if (vogaisDuplicadas) {
			System.out.println("- A senha não pode conter vogais duplicadas seguidas.");
		}

		if (temMaiuscula && temPrimo && temEspecial && !vogaisDuplicadas) {
			System.out.println(" Senha válida!");
		} else {
			System.out.println(" Senha inválida.");
		}

		sc.close();

	}

}
