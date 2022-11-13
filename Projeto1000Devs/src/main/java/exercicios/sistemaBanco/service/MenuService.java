package exercicios.sistemaBanco.service;

import exercicios.sistemaBanco.model.Cliente;
import exercicios.sistemaBanco.model.ClientePJ;
import exercicios.sistemaBanco.model.TipoConta;

import java.util.Random;
import java.util.Scanner;

public class MenuService {

    private static Scanner entrada = new Scanner(System.in);

    public static void menuGerente() {
        System.out.println("====================================================");
        System.out.println("=============== BANCO 1000Devs =====================");
        System.out.println("====================================================");
        System.out.println("1 - Cadastrar cliente");
    }

    public static void menuPrincipal() {
        System.out.println("====================================================");
        System.out.println("=============== BANCO 1000Devs =====================");
        System.out.println("====================================================");
        System.out.println("1 - Funcionario");
        System.out.println("2 - Cliente");
    }

    public static void menuCliente() {

        System.out.println("====================================================");
        System.out.println("=============== BANCO 1000Devs =====================");
        System.out.println("====================================================");
        System.out.println("1 - Primerio acesso");
        System.out.println("2 - Fazer login");
        int opcao = Integer.parseInt(entrada.nextLine());
        if (opcao == 1) {
            primeiroAcesso();
            painelCliente(login());
        } else {
            Cliente cliente = login();
            if (cliente != null) {
                painelCliente(cliente);
            } else {
                System.out.println("Conta Bloqueada");
            }
        }
    }

    private static void painelCliente(Cliente cliente) {
        System.out.println("====================================================");
        System.out.println("=============== BANCO 1000Devs =====================");
        System.out.println("====================================================");
        System.out.println("1 - Saldo");
        System.out.println("2 - Transferir");
        System.out.println("3 - Dados da Conta");
        int opcao =  Integer.parseInt(entrada.nextLine());
        switch (opcao) {
            case 1:
                System.out.println("Saldo " + cliente.getSaldo());
                break;
        }
    }

    public static Cliente login() {

        while (true) {
            System.out.println("====================================================");
            System.out.println("===================== LOGIN ========================");
            System.out.println("====================================================");
            System.out.print("Informe o número da conta: ");
            String numeroConta = entrada.nextLine();
            Cliente cliente = recuperarCliente(numeroConta);
            if (cliente != null) {
                int tentativa = 2;
                for (int i = 0; i < 3; i++) {
                    System.out.print("Informe a senha: ");
                    String senhaInformada = entrada.nextLine();

                    if (senhaInformada.equals(cliente.getSenha())) {
                        return cliente;
                    } else {
                        System.out.println("Senha invalida você tem mais " + tentativa + " Tentativas");
                        tentativa--;
                        if (tentativa == 0) {
                            return null;
                        }
                    }
                }

            } else {
                System.out.println("Número de conta Invalido");
            }
        }

    }

    private static void primeiroAcesso() {
        while (true) {
            System.out.print("Informe o número da conta: ");
            String numeroConta = entrada.nextLine();
            if (validarNumeroConta(numeroConta)) {
                while (true) {
                    System.out.print("Infome uma senha: ");
                    String senha = entrada.nextLine();
                    System.out.print("Infome novamente a senha: ");
                    String senha1 = entrada.nextLine();
                    if (senha.equals(senha1)) {
                        Cliente cliente = recuperarCliente(numeroConta);
                        cliente.setSenha(senha);
                        System.out.println("Senha cadastrada com sucesso");
                        break;
                    } else {
                        System.out.println("As senhas não pode ser diferente");
                    }
                }
                break;
            } else {
                System.out.println("Número da conta invalido");
            }

        }
    }

    private static Boolean validarNumeroConta(String numeroConta) {
        Cliente[] clientes = GerenteService.getClientesPj();
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
                return true;
            }
        }
        return false;
    }


    public static void cadastroCliente() {
        System.out.println("Qual tipo de cliente deseja Cadastrar ? " +
                "\n1 - PJ" +
                "\n2 - PF");
    }

    public static Cliente dadosCliente(int tipoCliente) {
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        String numeroConta = gerarNumeroConta();
        System.out.print("Telefone: ");
        String telefone = entrada.nextLine();
        System.out.print("Limete do cheque Especial: ");
        Double limiteCheque = Double.parseDouble(entrada.nextLine());
        if (tipoCliente == 1) {
            String agencia = "01";
            ClientePJ cliente = new ClientePJ();
            System.out.print("CNPJ: ");
            String cnpj = entrada.nextLine();
            System.out.print("Socio 1: ");
            String socio1 = entrada.nextLine();
            System.out.print("Socio 2: ");
            String socio2 = entrada.nextLine();
            System.out.print("Socio 3: ");
            String socio3 = entrada.nextLine();
            cliente.setNome(nome);
            cliente.setAgencia(agencia);
            cliente.setTelefone(telefone);
            cliente.setNumeroConta(numeroConta);
            cliente.setLimiteChequeEspecial(limiteCheque);
            cliente.setTipoConta(TipoConta.PJ);
            cliente.setSaldo(0.0);
            cliente.setCnpj(cnpj);
            String[] socios = {socio1, socio2, socio3};
            cliente.setSocios(socios);
            dadosClientePJ(cliente);
            return cliente;
        }
        return null;
    }

    private static String gerarNumeroConta() {
        Random random = new Random();
        Cliente[] clientes = GerenteService.getClientesPj();
        String numeracao = "";
        for (int i = 0; i < 5; i++) {
            numeracao += Integer.toString(random.nextInt(9));
        }
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(numeracao)) {
                numeracao = gerarNumeroConta();
            }
        }

        return numeracao;
    }

    public static void dadosClientePJ(ClientePJ cliente) {
        System.out.println("--------------------------------------------------------");
        System.out.println("------------------ CLIENTE CADASTRADO ------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("CNPJ: " + cliente.getCnpj());
        System.out.println("Número conta: " + cliente.getNumeroConta());
        System.out.println("Agencia: " + cliente.getAgencia());
        System.out.println("Limite cheque Especial: " + cliente.getLimiteChequeEspecial());
        System.out.println("Tipo conta: " + cliente.getTipoConta().toString());
        System.out.println("Saldo: " + cliente.getSaldo());
        System.out.print("Socicios: ");
        for (int i = 0; i < cliente.getSocios().length; i++) {
            if (i < 2) {
                System.out.print(cliente.getSocios()[i] + " / ");
            } else {
                System.out.println(cliente.getSocios()[i]);
            }
        }
        System.out.println("--------------------------------------------------------");


    }

    public static Cliente recuperarCliente(String numeroConta) {
        Cliente[] clientes = GerenteService.getClientesPj();
        for (int i = 0; i < 50; i++) {
            if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
                return (ClientePJ) clientes[i];
            }

        }
        return null;
    }
}
