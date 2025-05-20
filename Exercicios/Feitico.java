package Exercicios;

import java.util.Scanner;

public class Feitico {
    public static void main(String[] args) {
        String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o feitiço que deseja encontrar: ");
        String alvo = sc.nextLine();


        int posicao = buscaBinaria(feiticos, alvo);


        if (posicao != -1) {
            System.out.println("Feitiço encontrado na posição " + posicao);
        } else {
            System.out.println("Feitiço não encontrado.");
        }

        sc.close();
    }


    public static int buscaBinaria(String[] lista, String alvo) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = lista[meio].compareToIgnoreCase(alvo);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}
