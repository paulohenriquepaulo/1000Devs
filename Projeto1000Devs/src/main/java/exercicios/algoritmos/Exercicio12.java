package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.00");

        System.out.print("Informe a QTDE de frangos: ");
        double qntdFrango = entrada.nextDouble();

        double valorTotalAnelDireito = qntdFrango * 4.00;
        double valorTotalAnelEsquerdo = qntdFrango * 2 * 3.50;

        System.out.println("\nO valor total para identificar os frangos é: " +
                format.format(valorTotalAnelDireito + valorTotalAnelEsquerdo));

    }
}
