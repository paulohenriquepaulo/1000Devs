package exercicios.sistemaBanco.service;

import exercicios.sistemaBanco.model.Cliente;
import exercicios.sistemaBanco.model.ClientePJ;
import exercicios.sistemaBanco.model.TipoConta;

public class GerarClienteAutomatico {

    public static ClientePJ gerarClientePJ() {
        ClientePJ clientepj = new ClientePJ();
        clientepj.setNome("Paulo");
        clientepj.setTelefone("84695789");
        clientepj.setLimiteChequeEspecial(700d);
        clientepj.setCnpj("789456123");
        clientepj.setTipoConta(TipoConta.PJ);
        String[] socios  =  {"Pedro", "João", "Ana"};
        clientepj.setSocios(socios);
        clientepj.setSaldo(0.0);
        clientepj.setNumeroConta("12345");
        clientepj.setAgencia("01");
        return clientepj;
    }


}
