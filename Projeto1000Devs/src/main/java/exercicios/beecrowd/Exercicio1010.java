package exercicios.beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1010 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.00");

        int codigo1 = entrada.nextInt();
        int qntd1 = entrada.nextInt();
        double valor1 = entrada.nextDouble();

        int codigo2 = entrada.nextInt();
        int qntd2 = entrada.nextInt();
        double valor2 = entrada.nextDouble();
        double valorPagar = qntd2 * valor2 + qntd1 * valor1;

        System.out.println("VALOR A PAGAR: R$ " + format.format(valorPagar));
    }
}
