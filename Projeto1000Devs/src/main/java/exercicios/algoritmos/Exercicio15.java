package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.00");

        System.out.print("Digite a quantidade total de horas normais: ");
        double horaNormal = entrada.nextDouble() * 10;

        System.out.print("Digite a quantidade total de horas extras: ");
        double horaExtras = entrada.nextDouble() * 15;

        System.out.print("Digite a quantidade total de dependentes menores que 6 anos: ");
        double qntdDependetes = entrada.nextDouble() * 90;

        double salarioLiquido = horaNormal - (horaNormal * 0.11);
        double salarioFinal = salarioLiquido + horaExtras + qntdDependetes;
        System.out.println("\nHoras normais: R$ " + format.format(horaNormal) +
                "\nAdicional de Horas Eeeeeextras: R$ " + format.format(horaExtras) +
                "\nAdicional de Dependentes: R$ " + format.format(qntdDependetes) +
                "\nSalario Liquido (Hrs normais - Desconto): R$ " + format.format(salarioLiquido) +
                "\nSalario final: R$ " + format.format(salarioFinal));
    }
}
