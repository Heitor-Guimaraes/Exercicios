package Exercicios;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] candidatos = { "Leão", "Coruja", "Raposa", "Tigre" };
		int[] votos = new int[candidatos.length];
		int totalVotos = 0;

		System.out.println("=== Votação para Mascote da Turma ===");
		System.out.println("Digite o número do candidato para votar ou 'fim' para encerrar:");

		for (int i = 0; i < candidatos.length; i++) {
			System.out.println(i + " - " + candidatos[i]);
		}

		while (true) {
			System.out.print("Seu voto: ");
			String entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("fim")) {
				break;
			}

			try {
				int voto = Integer.parseInt(entrada);
				if (voto >= 0 && voto < candidatos.length) {
					votos[voto]++;
					totalVotos++;
					System.out.println("Voto registrado para " + candidatos[voto] + "!");
				} else {
					System.out.println("Candidato inválido.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Digite o número do candidato ou 'fim'.");
			}
		}

		System.out.println("\n=== Resultado da Votação ===");

		if (totalVotos == 0) {
			System.out.println("Nenhum voto foi registrado.");
		} else {
			for (int i = 0; i < candidatos.length; i++) {
				double porcentagem = (votos[i] * 100.0) / totalVotos;
				System.out.printf("%s: %d votos (%.2f%%)\n", candidatos[i], votos[i], porcentagem);
			}
		}

		sc.close();

	}

}
