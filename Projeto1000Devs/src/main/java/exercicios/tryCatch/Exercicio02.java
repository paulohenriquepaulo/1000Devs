package exercicios.tryCatch;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.#");
        double valorSalarioMinimo;
        double valorSalarioFuncionario;
        double quantidadeSalarioMinimo;

        while (true) {

        try {
            System.out.print("Informe o valor do salaraio minimo: ");
            valorSalarioMinimo = entrada.nextDouble();
            validarValor(valorSalarioMinimo);
            System.out.print("Informe o valor do salaraio do funcionario: ");
            valorSalarioFuncionario = entrada.nextDouble();
            validarValor(valorSalarioFuncionario);
            quantidadeSalarioMinimo = valorSalarioFuncionario / valorSalarioMinimo;
            break;
        } catch (InputMismatchException e) {
            System.out.println("O valor precisar ser númerico");
            entrada.nextLine();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
       System.out.println("\nO funcionario recebe " + format.format(quantidadeSalarioMinimo) + " salarios minimos!");
    }

    static void validarValor(double valor) {
        if (valor <= 0) {
            throw new RuntimeException("O valor precisar ser maior que zero");
        }
    }
}
