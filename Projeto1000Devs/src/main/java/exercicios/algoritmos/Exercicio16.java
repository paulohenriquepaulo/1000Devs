package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.00");

        System.out.print("Digite o valor do faturamento anterior: ");
        double faturamentoAnterior = entrada.nextDouble();

        double metaDeFaturamento = faturamentoAnterior * 0.20;

        System.out.println("\nA meta do proximo mes e: " + format.format(faturamentoAnterior + metaDeFaturamento) +
                "\nUm aumento de: " + metaDeFaturamento +
                "\nQuantidade de pecas a serem vendidas para atingirmos a meta: " +
                "\n\nProduto 1: " + format.format(metaDeFaturamento / 150) + " pecas" +
                "\nProduto 2: " + format.format(metaDeFaturamento / 220) + " pecas" +
                "\nProduto 3: " + format.format(metaDeFaturamento / 97) + " pecas");

    }
}
