package exercicios.algoritmos;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dias = entrada.nextInt();

        System.out.print("Digite o mes: ");
        int mes = entrada.nextInt();

        System.out.println("\nA quantidade de dias que se passaram foi: " +
                ((mes * 30) + dias) + " dias");
    }
}
