package Exercicios;

import java.util.Scanner;

public class CodigosPerdidos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite os códigos (ex: 4H 7A 2C), separados por espaço:");
        String linha = scanner.nextLine();


        String[] codigos = linha.split("");


        String resultado = "";

        for (String codigo : codigos) {
            int tamanho = codigo.length();
            int i = 0;


            while (i < tamanho && Character.isDigit(codigo.charAt(i))) {
                i++;
            }

            int quantidade = Integer.parseInt(codigo.substring(0, i));
            char letra = codigo.charAt(i);


            for (int j = 0; j < quantidade; j++) {
                resultado += letra;
            }
        }


        System.out.println("Código reconstruído: " + resultado);

        scanner.close();
    }
}
