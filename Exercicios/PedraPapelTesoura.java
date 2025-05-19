package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		String[] opcoes = { "Pedra", "Papel", "Tesoura", "Lagarto", "Spock" };

		System.out.println("=== Jogo: Pedra, Papel, Tesoura, Lagarto, Spock ===");
		System.out.println("Escolha uma opção:");
		for (int i = 0; i < opcoes.length; i++) {
			System.out.println(i + " - " + opcoes[i]);
		}

		System.out.print("Sua escolha: ");
		int jogador = sc.nextInt();

		if (jogador < 0 || jogador >= opcoes.length) {
			System.out.println("Escolha inválida.");
			return;
		}

		int computador = rand.nextInt(opcoes.length);

		System.out.println("Você escolheu: " + opcoes[jogador]);
		System.out.println("Computador escolheu: " + opcoes[computador]);

		if (jogador == computador) {
			System.out.println("Empate!");
		} else if ((jogador == 2 && computador == 1) || // Tesoura corta papel
				(jogador == 1 && computador == 0) || // Papel cobre pedra
				(jogador == 0 && computador == 3) || // Pedra esmaga Lagarto
				(jogador == 3 && computador == 4) || // Lagarto envenena Spock
				(jogador == 4 && computador == 0) || // Spock vaporiza pedra
				(jogador == 0 && computador == 2) || // Pedra quebra tesoura
				(jogador == 2 && computador == 3) || // Tesoura decapita Lagarto
				(jogador == 3 && computador == 1) || // Lagarto come papel
				(jogador == 1 && computador == 4) || // Papel refuta Spock
				(jogador == 4 && computador == 2) // Spock quebra tesoura
		) {
			System.out.println("Você venceu!");
		} else {
			System.out.println("Computador venceu!");
		}

		sc.close();

	}

}
