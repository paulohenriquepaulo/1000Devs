package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1008 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.00");

        int funcionario = entrada.nextInt();
        int horasTrabalhadas = entrada.nextInt();
        double valorHora = entrada.nextDouble();

        System.out.println("NUMBER = " + funcionario +
                "\nSALARY = U$ " + format.format( horasTrabalhadas * valorHora));

    }
}
