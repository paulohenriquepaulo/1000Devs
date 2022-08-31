package exercicios.decisao;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.000");
        double a = 0;
        double b = 0;
        double c = 0;
        byte opcao = 0;

        System.out.println("Informe qual area você quer calcular: " +
                "\n1- TRAPÉZIO " +
                "\n2- QUADRADO " +
                "\n3- RETANGULO " +
                "\n4- Circulo " +
                "\n5- TRIANGULO");
        try {
            opcao = entrada.nextByte();
            validarValorOpcao(opcao);
            if (opcao == 1) {
                System.out.print("Informe a base maior: ");
                a = entrada.nextDouble();
                System.out.print("Informe a base menor: ");
                b = entrada.nextDouble();
                System.out.print("Informe a altura: ");
                c = entrada.nextDouble();
                System.out.println("TRAPEZIO: " + format.format((a + b) * c / 2));

            } else if (opcao == 2) {
                System.out.print("Informe o tamanho do lado: ");
                b = entrada.nextDouble();
                System.out.println("QUADRADO: " + format.format(b * b));

            } else if (opcao == 3) {
                System.out.print("Informe a altura: ");
                a = entrada.nextDouble();
                System.out.print("Informe a largura: ");
                b = entrada.nextDouble();
                System.out.println("RETANGULO: " + format.format(a * b));

            } else if (opcao == 4) {
                double pi = 3.14159;
                System.out.print("Informe o raio ");
                a = entrada.nextDouble();
                System.out.println("CIRCULO: " + format.format(pi * Math.pow(a, 2)));

            } else if (opcao == 5) {
                System.out.print("Informe a base: ");
                a = entrada.nextDouble();
                System.out.print("Informe a altura: ");
                b = entrada.nextDouble();
                System.out.println("TRIANGULO: " + format.format((a * b) / 2));
            }

        } catch (InputMismatchException e) {
            System.err.println("O valor preciser ser numerico");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }

    }

    static void validarValorOpcao(byte valor) {
        if (valor > 5 || valor < 0) {
            throw new RuntimeException("Valor invalido, precisar ser entre 1 - 5");
        }
    }

}
