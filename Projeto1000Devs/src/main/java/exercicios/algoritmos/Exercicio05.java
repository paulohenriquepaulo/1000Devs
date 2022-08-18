package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##,##0.00");

        System.out.print("Informe o valor 1: ");
        int valor1 = entrada.nextInt();

        System.out.print("Informe o valor 2: ");
        double valor2 = entrada.nextInt();

        if (valor2 == 0) {
            System.err.println("\nNão existe divisão por zero");
        } else {
            System.out.println("\nA divisão de " + valor1 + " por " + ((int) valor2) + " é: " + format.format(valor1 / valor2));
        }
    }
}
