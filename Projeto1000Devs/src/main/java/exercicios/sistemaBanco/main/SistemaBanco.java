package exercicios.sistemaBanco.main;

import exercicios.sistemaBanco.model.Cliente;
import exercicios.sistemaBanco.service.GerarClienteAutomatico;
import exercicios.sistemaBanco.service.GerenteService;
import exercicios.sistemaBanco.service.MenuService;

import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GerenteService gerenteService = new GerenteService();
        Cliente c = gerenteService.cadastrarCliente(GerarClienteAutomatico.gerarClientePJ());
        System.out.println(c.getNumeroConta());
        MenuService.menuPrincipal();
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            switch (opcao) {
                case 1:
                    MenuService.cadastroCliente();
                    int tipoCliente = entrada.nextInt();
                    MenuService.dadosCliente(tipoCliente);
                    break;
            }
        } else {
            MenuService.menuCliente();

        }
    }
}