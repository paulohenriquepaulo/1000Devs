package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.##");

        System.out.print("Informe a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Informe a nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Informe a nota 3: ");
        double nota3 = entrada.nextDouble();

        double mediaPonderada  = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3)) / (1 + 2 + 3);

        System.out.println("\nA media ponderada das notas " +
                nota1 + ", " + nota2 + ", " + nota3 + " é: " + format.format(mediaPonderada ));
    }
}
