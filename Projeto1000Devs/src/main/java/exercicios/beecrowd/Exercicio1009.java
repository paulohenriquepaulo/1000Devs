package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1009 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.00");

        String vendedor = entrada.nextLine();
        double valorSalario = entrada.nextDouble();
        double valorVendas = entrada.nextDouble();
        double salarioFinal = valorSalario + (valorVendas * 0.15);
        System.out.println("TOTAL = R$ " + format.format(salarioFinal));


    }
}
