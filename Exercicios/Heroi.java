package Exercicios;

import java.util.Scanner;

public class Heroi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[10];
		int[] forcas = new int[10];
		int[] inteligencias = new int[10];
		int[] velocidades = new int[10];
		int[] poderes = new int[10];
		int totalHerois = 0;

		while (true) {
			System.out.print("\n1 - Adicionar herói\n2 - Listar e ordenar\n3 - Comparar dois\n0 - Sair\nEscolha: ");
			int opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 0)
				break;

			if (opcao == 1) {
				if (totalHerois >= 10) {
					System.out.println("Limite de heróis atingido.");
					continue;
				}

				System.out.print("Nome do herói: ");
				nomes[totalHerois] = sc.nextLine();

				System.out.print("Força: ");
				forcas[totalHerois] = sc.nextInt();

				System.out.print("Inteligência: ");
				inteligencias[totalHerois] = sc.nextInt();

				System.out.print("Velocidade: ");
				velocidades[totalHerois] = sc.nextInt();

				poderes[totalHerois] = forcas[totalHerois] * 2 + inteligencias[totalHerois] * 3
						+ velocidades[totalHerois];

				System.out.println("Herói adicionado com poder total: " + poderes[totalHerois]);

				totalHerois++;
			}

			else if (opcao == 2) {

				int[] indices = new int[totalHerois];
				for (int i = 0; i < totalHerois; i++) {
					indices[i] = i;
				}

				for (int i = 0; i < totalHerois - 1; i++) {
					for (int j = 0; j < totalHerois - i - 1; j++) {
						if (poderes[indices[j]] < poderes[indices[j + 1]]) {
							int temp = indices[j];
							indices[j] = indices[j + 1];
							indices[j + 1] = temp;
						}
					}
				}

				System.out.println("\n--- Heróis Ordenados por Poder ---");
				for (int i = 0; i < totalHerois; i++) {
					int idx = indices[i];
					System.out.println(nomes[idx] + " | Poder: " + poderes[idx] + " | Força: " + forcas[idx]
							+ ", Inteligência: " + inteligencias[idx] + ", Velocidade: " + velocidades[idx]);
				}
			}

			else if (opcao == 3) {
				if (totalHerois < 2) {
					System.out.println("Você precisa de pelo menos dois heróis para comparar.");
					continue;
				}

				for (int i = 0; i < totalHerois; i++) {
					System.out.println(i + " - " + nomes[i] + " (Poder: " + poderes[i] + ")");
				}

				System.out.print("Número do primeiro herói: ");
				int h1 = sc.nextInt();
				System.out.print("Número do segundo herói: ");
				int h2 = sc.nextInt();

				if (h1 < 0 || h1 >= totalHerois || h2 < 0 || h2 >= totalHerois) {
					System.out.println("Índice inválido.");
				} else {
					System.out.println("\nComparando:");
					System.out.println(nomes[h1] + " → Poder: " + poderes[h1]);
					System.out.println(nomes[h2] + " → Poder: " + poderes[h2]);

					if (poderes[h1] > poderes[h2]) {
						System.out.println("→ " + nomes[h1] + " é mais poderoso.");
					} else if (poderes[h2] > poderes[h1]) {
						System.out.println("→ " + nomes[h2] + " é mais poderoso.");
					} else {
						System.out.println("→ Ambos têm o mesmo poder.");
					}
				}
			}

			else {
				System.out.println("Opção inválida.");
			}
		}

		System.out.println("Programa encerrado.");
		sc.close();

	}

}
