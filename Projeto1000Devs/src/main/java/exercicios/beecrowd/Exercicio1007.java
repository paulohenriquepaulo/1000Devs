package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1007 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0");

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();
        int x = a * b - c * d;
        System.out.println("DIFERENCA = " + x);
    }
}
