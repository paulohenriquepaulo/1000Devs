package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##,##0.00");

        System.out.print("Informe o número para o cálculo da tabuada: ");
        double numero = entrada.nextInt();

        System.out.println("\nTabuada do + e - para o número " + numero + ": ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numero + " + " + i + " = " + (numero + i));
            if (numero - i >= 0) {
            System.out.println("\t\t\t" + numero + " - " + i + " = " + (numero - i));
            } else {
            System.out.println("\t\t\t" + numero + " - " + i + " = " + ((numero - i) * -1));
            }
        }

        System.out.println("\nTabuada do * e / para o número " + numero + ": ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numero + " * " + i + " = " + (numero * i));
            if (i != 0) {
                System.out.println("\t\t\t" + numero + " / " + i + " = " + format.format(numero / i));
            } else {
                System.out.println("\t\t\t" + numero + " - " + i + " = " + "não existe divisão por zero");
            }
        }
    }
}
