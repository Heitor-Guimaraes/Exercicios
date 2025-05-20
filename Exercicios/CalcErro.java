package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class CalcErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultadoCorreto = 0;


        switch (operador) {
            case '+':
                resultadoCorreto = num1 + num2;
                break;
            case '-':
                resultadoCorreto = num1 - num2;
                break;
            case '*':
                resultadoCorreto = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultadoCorreto = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }


        double erroPercentual = (random.nextDouble() * 2 - 1) / 100.0; // entre -0.01 e 0.01
        double resultadoComErro = resultadoCorreto + (resultadoCorreto * erroPercentual);


        System.out.printf("Resultado com erro: %.4f (erro de %.2f%%)%n", resultadoComErro, erroPercentual * 100);

        scanner.close();
    }
}
