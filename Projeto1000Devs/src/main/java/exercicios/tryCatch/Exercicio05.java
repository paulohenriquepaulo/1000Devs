package exercicios.tryCatch;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##,##0.00");
        int valor1 = 0;
        double valor2 = 0.0;

        while (true) {
            try {
                System.out.print("Informe o valor 1: ");
                valor1 = entrada.nextInt();

                System.out.print("Informe o valor 2: ");
                valor2 = entrada.nextInt();
                validarValorDivisor(valor2);
                break;
            } catch (InputMismatchException e) {
                System.out.println("O valor precisar ser numérico");
                entrada.nextLine();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
            System.out.println("\nA divisão de " + valor1 + " por " + ((int) valor2) + " é: " + format.format(valor1 / valor2));
    }

    static void validarValorDivisor(double valor) {
        if (valor == 0) {
            throw new RuntimeException("\nNão existe divisão por zero");
        }
    }
}
