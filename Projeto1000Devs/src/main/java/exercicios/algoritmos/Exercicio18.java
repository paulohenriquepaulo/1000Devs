package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.00");

        System.out.print("Informe o valor da conta R$: ");
        double valorConta = entrada.nextDouble();
        int valorDivido = (int) valorConta / 3;

        System.out.println("\nCarlos pagara: R$ " + valorDivido +
                "\nAndre pagara: R$ " + valorDivido +
                "\nFelipe pagara: R$ " + format.format(  valorConta - (valorDivido * 2)));

    }
}
