package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.0000");

        double r = entrada.nextDouble();
        double a = 3.14159 * r * r;
        System.out.println("A=" + format.format(a));
    }
}
