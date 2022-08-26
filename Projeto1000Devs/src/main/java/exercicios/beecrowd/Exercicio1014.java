package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1014 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.000");

        int x = entrada.nextInt();
        double y = entrada.nextDouble();
        double media = x / y;

        System.out.println(format.format(media) + " km/l");
    }
}
