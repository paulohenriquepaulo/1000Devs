package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1017 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.000");

        int horas = entrada.nextInt();
        int velocidade = entrada.nextInt();
        System.out.println(format.format( (double) velocidade * horas / 12));
    }
}
