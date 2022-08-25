package exercicios.tryCatch;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.##");
        double nota1;
        double nota2;
        double nota3;
        double mediaPonderada;

        while (true) {
            try {
                System.out.print("Informe a nota 1: ");
                nota1 = entrada.nextDouble();
                validarNota(nota1);

                System.out.print("Informe a nota 2: ");
                nota2 = entrada.nextDouble();
                validarNota(nota2);

                System.out.print("Informe a nota 3: ");
                nota3 = entrada.nextDouble();
                validarNota(nota3);

                mediaPonderada = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3)) / 6;
                break;
            } catch (InputMismatchException e) {
                System.out.println("O valor informado precisa ser numéricos");
                entrada.nextLine();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("\nA media ponderada das notas " +
                nota1 + ", " + nota2 + ", " + nota3 + " é: " + format.format(mediaPonderada));
    }

    static void validarNota(double nota) {
        if (nota < 0) {
            throw new RuntimeException("O valor da nota não pode ser negativo");
        }
    }
}
