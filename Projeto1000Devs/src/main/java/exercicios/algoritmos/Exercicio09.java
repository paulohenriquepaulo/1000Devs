package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##,##0.00");

        System.out.print("Area do trapezio: \nInforme o valor da base maior: ");
        double baseMaior = entrada.nextDouble();
        System.out.print("Informe o valor da base menor: ");
        double baseMenor = entrada.nextDouble();
        System.out.print("Informe o valor da altura: ");
        double altura = entrada.nextDouble();
        double areaTrapezio = (baseMaior + baseMenor) * altura / 2;
        System.out.println("A area do trapezio é: " + format.format(areaTrapezio));

        System.out.print("\nArea do quadrado: \nInforme o valor de um dos lados: ");
        double lado = entrada.nextDouble();
        System.out.println("A area do quadrado é: " + format.format(lado * lado));

        System.out.print("\nArea do retangulo: \nInforme o valor da largura: ");
        double lagura = entrada.nextDouble();
        System.out.print("Informe o valor da altura: ");
        double alturaRetangulo = entrada.nextDouble();
        double areaRetangulo = lagura * alturaRetangulo;
        System.out.println("A area do retangulo é: " + format.format(areaRetangulo));

        System.out.print("\nArea do circulo: \nInforme o valor do raio: ");
        double raio = entrada.nextDouble();
        double areaCirculo = 3.14 * (raio * raio);
        System.out.println("A area do ciculo é: " + areaCirculo);

        System.out.print("\nArea do triangulo: \nInforme o valor da base: ");
        double baseTriangulo = entrada.nextDouble();
        System.out.print("Informe o valor da altura: ");
        double alturaTriangulo = entrada.nextDouble();
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("A area do triangulo é: " + format.format(areaTriangulo));


    }
}
