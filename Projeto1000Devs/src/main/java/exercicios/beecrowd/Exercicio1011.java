package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1011 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.000");

        double pi = 3.14159;
        int raio = entrada.nextInt();
        double volume = (4/3.0) * pi * Math.pow(raio, 3);

        System.out.println("VOLUME = " + format.format(volume));
    }
}
