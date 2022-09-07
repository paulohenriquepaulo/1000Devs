package exercicios.atividadesAvaliativas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Integer valorSaque = 0;
        boolean apresentarNotas = true;
        System.out.println("========================================================================");
        System.out.println("========================== CAIXA ELETRÔNICO ============================");
        System.out.println("========================================================================");
        while (true) {
            if (apresentarNotas) {
                System.out.println("Notas de: \nR$ 100,00 \nR$ 50,00 \nR$ 20,00 \nR$ 10,00 \nR$ 5,00");
            }
            System.out.print("------------------------------------------------------------------------" +
                    "\nInforme o valor que deseja sacar: ");
            try {
                valorSaque = entrada.nextInt();
                validarValorSaque(valorSaque);
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nO valor informado precisa ser números");
                entrada.nextLine();
                apresentarNotas = false;
            } catch (RuntimeException e) {
                System.err.println("\n" + e.getMessage());
                apresentarNotas = false;
            } catch (Exception e) {
                System.out.println("\n" + e.getMessage());
                apresentarNotas = true;
            }

        }

        System.out.println("valor 100: \t" + (valorSaque / 100));
        valorSaque = valorSaque - valorSaque / 100 * 100;
        System.out.println("valor 50: \t" + (valorSaque / 50));
        valorSaque = valorSaque % 50;
        System.out.println("valor 20: \t" + (valorSaque / 20));
        valorSaque = valorSaque % 20;
        System.out.println("valor 10: \t" + (valorSaque / 10));
        valorSaque = valorSaque % 10;
        System.out.println("valor 5: \t" + (valorSaque / 5));

    }

    static void validarValorSaque(Integer valor) throws Exception {

        if (valor <= 0) {
            throw new RuntimeException("O valor precisar ser maior que zero.");
        }
        //Desconbrindo o tamnho do número informado para saque
        int tamanho = valor.toString().length();

        //Transformando o valor de saque em String e pegando seu ultimo caracter
        // para validar se é possivel efetuar o saque.
        String valorString = String.valueOf(valor.toString().charAt(tamanho - 1));

        //Transformando o valor do ultimo caracter em inteiro
        int valorInt = Integer.parseInt(valorString);
        if (valorInt != 5 && valorInt != 0) {
            throw new Exception("O valor do saque é invalido, veja as notas disponiveis abaixo:");
        }
    }
}
