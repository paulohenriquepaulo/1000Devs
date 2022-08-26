package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1015 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0000");

       double x1 = entrada.nextDouble();
       double y1 = entrada.nextDouble();
       double x2 = entrada.nextDouble();
       double y2 = entrada.nextDouble();

       double distancia = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);

       System.out.println(format.format(Math.sqrt(distancia)));
    }
}
