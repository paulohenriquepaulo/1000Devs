package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1012 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.000");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double pi = 3.14159;

        System.out.println("TRIANGULO: " + format.format((a * c) / 2));
        System.out.println("CIRCULO: " + format.format(pi * Math.pow(c, 2)));
        System.out.println("TRAPEZIO: " + format.format((a + b) * c / 2));
        System.out.println("QUADRADO: " + format.format(b * b));
        System.out.println("RETANGULO: " + format.format(a * b));
    }
}
