package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format  = new DecimalFormat("00.00");

        System.out.print("Digite a quantidade de paes vendidos: ");
        double paesVendidos = entrada.nextDouble();

        System.out.print("Digite a quantidade de broas vendidas: ");
        double broasVendidas = entrada.nextDouble();

        System.out.print("Digite o valor da reforma: ");
        double valorReforma = entrada.nextDouble();

        double faturamentoDiario = (paesVendidos * 0.12) + (broasVendidas * 1.60);
        System.out.println("Faturamento com a venda de broas: " + format.format(broasVendidas * 1.60) +
                "\nFaturamento com a venda de paes: " + format.format(paesVendidos * 0.12) +
                "\nFaturamento diario (paes + broa): " + format.format(faturamentoDiario) +
                "\nValor do deposito na poupanca: " + format.format(faturamentoDiario * 0.10) +
                "\nPara pagar a remorma serão necessarios: " + Math.round((valorReforma / (faturamentoDiario * 0.10))) + " dias");

    }
}
