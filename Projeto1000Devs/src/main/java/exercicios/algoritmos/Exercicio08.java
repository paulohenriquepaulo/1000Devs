package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");


        System.out.print("Informe o salario: ");
        double salario = entrada.nextDouble();

        double salarioReajustado = salario + (salario * 0.15);
        double inss = salarioReajustado * 0.11;
        double fgts = salarioReajustado * 0.08;

        System.out.println("\nSalario Inicial: " + format.format(salario)  +
                "\nSalario Reajustado: " + format.format(salarioReajustado) +
                "\nDesconto 11% INSS: " + format.format(inss) +
                "\nDesconto 8% FGTS: " + format.format(fgts) +
                "\nTotal Descontos INSS + FGTS: " + format.format(inss + fgts) +
                "\nSalario Final: " + format.format(salarioReajustado - (inss + fgts)));
    }
}
