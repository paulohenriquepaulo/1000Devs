package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format1 = new DecimalFormat("##,##0.00");
        DecimalFormat format2 = new DecimalFormat("####,##0000.00");

        System.out.print("Informe o salario: ");
        double salario = entrada.nextDouble();

        double salarioReajustado = salario + (salario * 0.15);
        double inss = salarioReajustado * 0.11;
        double fgts = salarioReajustado * 0.08;

        System.out.println("\nSalario Inicial: " + format2.format(salario)  +
                "\nSalario Reajustado: " + format2.format(salarioReajustado) +
                "\nDesconto 11% INSS: " + format1.format(inss) +
                "\nDesconto 8% FGTS: " + format1.format(fgts) +
                "\nTotal Descontos INSS + FGTS: " + format1.format(inss + fgts) +
                "\nSalario Final: " + format2.format(salarioReajustado - (inss + fgts)));
    }
}
