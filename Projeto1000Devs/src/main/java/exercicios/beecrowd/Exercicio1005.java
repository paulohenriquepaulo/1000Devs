package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1005 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00000");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double media = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);
        System.out.println("MEDIA = " + format.format(media));
    }
}
