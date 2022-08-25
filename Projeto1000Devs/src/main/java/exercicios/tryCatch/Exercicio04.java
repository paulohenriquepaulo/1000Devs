package exercicios.tryCatch;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##,##0.00");
        Double numero = 0.0;

        while (true) {
            try {
                System.out.print("Informe o número para o cálculo da tabuada: ");
                numero = entrada.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("O valor precisar ser numérico");
                break;
            }
        }

        Integer numeroInteiro = numero.intValue();

        System.out.println("\nTabuada do + e - para o número " + numeroInteiro + ": ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeroInteiro + " + " + i + " = " + (numeroInteiro + i));
            System.out.println("\t\t\t" + numeroInteiro + " - " + i + " = " + Math.abs(numeroInteiro - i));
        }

        System.out.println("\nTabuada da * e / para o número " + numeroInteiro + ": ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeroInteiro + " * " + i + " = " + (numeroInteiro * i));
            if (i == 0) {
                System.out.println("\t\t\t" + numeroInteiro + " / " + i + " = " + "não existe divisão por zero");
            } else {
                System.out.println("\t\t\t" + numeroInteiro + " / " + i + " = " + format.format(numero / i));
            }
        }
    }
}
