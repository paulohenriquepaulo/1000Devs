package exercicios.atividadesAvaliativas;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("00.00");

        int contador = 1;
        int quantidadeParcelas = 0;
        double valorTotalCompras = 0;
        double valorTotalDesconto = 0;
        double valorTotalJuros = 0;
        double totalComprasAvista = 0;
        double totalCompraParcelada = 0;
        double valorCompra = 0;
        double valorDesconto = 0;


        while (true) {
            System.out.println("===========================================================");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>> COMPRA 0" + contador + " <<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("===========================================================");
            System.out.print("\nInforme o valor total da compra: ");
            try {
                valorCompra = entrada.nextDouble();
                validarValorCompra(valorCompra);
                System.out.println("===========================================================");
                System.out.println(">>>>>>>>>>>>>>>>>>> FORMA DE PAGAMENTO <<<<<<<<<<<<<<<<<<<<");
                System.out.println("===========================================================");

                System.out.println("1 - À vista, com 8% de desconto" +
                        "\n2 - À vista no cartão, 4% de desconto" +
                        "\n3 - Em 2x, preço normal sem juros" +
                        "\n4 - Em 4x, preço acrescido de 8%");
                System.out.print("\nDigite a forma de pagamento: ");
                quantidadeParcelas = entrada.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida");
                valorCompra = 0;
                quantidadeParcelas = 0;
                entrada.nextLine();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            switch (quantidadeParcelas) {
                case 1:
                    valorDesconto = calcularDescontoEJuros(valorCompra, quantidadeParcelas);
                    valorTotalCompras += valorCompra - valorDesconto;
                    totalComprasAvista += valorCompra - valorDesconto;
                    valorTotalDesconto += valorDesconto;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Desconto de 8%" +
                            "\nValor final R$" + format.format(valorCompra - valorDesconto));
                    System.out.println("-----------------------------------------------------------");
                    contador++;
                    break;
                case 2:
                    valorDesconto = calcularDescontoEJuros(valorCompra, quantidadeParcelas);
                    totalComprasAvista += valorCompra - valorDesconto;
                    valorTotalCompras += valorCompra - valorDesconto;
                    valorTotalDesconto += valorDesconto;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Desconto de 4%" +
                            "\nValor final R$" + format.format(valorCompra - valorDesconto));
                    System.out.println("-----------------------------------------------------------");
                    contador++;
                    break;
                case 3:
                    totalCompraParcelada += valorCompra;
                    valorTotalCompras += valorCompra;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Desconto de 0%" +
                            "\nEm 2x de R%" + format.format(valorCompra / 2) +
                            "\nValor final R$" + format.format(valorCompra));
                    System.out.println("-----------------------------------------------------------");
                    contador++;
                    break;
                case 4:
                    double juros = calcularDescontoEJuros(valorCompra, quantidadeParcelas);
                    valorTotalJuros += juros;
                    valorTotalCompras += valorCompra + juros;
                    totalCompraParcelada += valorCompra + juros;
                    valorCompra = valorCompra + juros;
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Acrecimo de 8%" +
                            "\nEm 4x de R%" + format.format(valorCompra / 4) +
                            "\nValor final R$" + format.format(valorCompra));
                    System.out.println("-----------------------------------------------------------");
                    contador++;
                    break;
                default:
                    System.out.println("A compra não será processada");
                    contador++;
                    break;
            }
            if (contador > 5) break;
        }

        System.out.println("\nTotal Compras: R$" + format.format(valorTotalCompras) +
                "\nTotal de compras \"À vista\": R$" + format.format(totalComprasAvista) +
                "\nTotal de compras \"parceladas\": R$" + format.format(totalCompraParcelada) +
                "\n\nTotal de descontos: R$" + format.format(valorTotalDesconto) +
                "\nTotal de Juros: R$" + format.format(valorTotalJuros));
    }

    static double calcularDescontoEJuros(double valorCompra, int quantidadeParcelas) {

        switch (quantidadeParcelas) {
            case 1:
                return valorCompra = valorCompra * 0.08;
            case 2:
                return valorCompra = valorCompra * 0.04;
            case 4:
                return valorCompra = valorCompra * 0.08;
        }
        return valorCompra;
    }

    static void validarValorCompra(double valorCompra) {

        if (valorCompra <= 0) {
            throw new RuntimeException("O valor de compra não poder ser igual o menor que 0.");
        }
    }
}
