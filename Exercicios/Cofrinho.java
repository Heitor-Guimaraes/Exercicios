package Exercicios;

import java.util.Scanner;

public class Cofrinho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] valoresMoedas = { 0.01, 0.05, 0.10, 0.25, 0.50, 1.00 };
		int[] quantidades = new int[valoresMoedas.length];
		double total = 0.0;

		System.out.println("=== Simulador de Cofrinho Inteligente ===");

		for (int i = 0; i < valoresMoedas.length; i++) {
			System.out.print("Digite a quantidade de moedas de R$ " + String.format("%.2f", valoresMoedas[i]) + ": ");
			quantidades[i] = sc.nextInt();
			total += quantidades[i] * valoresMoedas[i];
		}

		System.out.printf("Total economizado: R$ %.2f%n", total);

		double meta = 100.00;
		if (total >= meta) {
			System.out.println("Parabéns! Você atingiu ou ultrapassou a meta de R$ 100,00!");
		} else {
			double falta = meta - total;
			System.out.printf("Faltam R$ %.2f para atingir a meta de R$ 100,00.%n", falta);

			if (total > 0) {
				int semanas = (int) (falta / total);
				if ((falta / total) > semanas) {
					semanas++;
				}
				System.out.printf(
						"Se você repetir esse depósito toda semana, levará aproximadamente %d semana(s) para atingir a meta.%n",
						semanas);
			} else {
				System.out.println("Você precisa depositar alguma quantia para calcular as semanas.");
			}
		}

		sc.close();

	}

}
