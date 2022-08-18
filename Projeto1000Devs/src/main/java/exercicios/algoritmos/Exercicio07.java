package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##,##0.00");

        System.out.print("Informe o pedo em KG: ");
        double peso = entrada.nextDouble();

        System.out.println("\nCaso a pessoa engorde 15% ficara com: " + format.format(peso + (peso * 0.15)) + " KG" +
                "\nCaso a pessoa engorde 20% ficara com: " + format.format(peso + (peso * 0.20)) + " KG");
    }
}
