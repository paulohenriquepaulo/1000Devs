package exercicios.sistemaBanco.service;

import exercicios.sistemaBanco.model.Cliente;
import exercicios.sistemaBanco.model.TipoConta;

public class GerenteService {

    private static final Cliente[] clientesPj = new Cliente[50];

    public Cliente cadastrarCliente(Cliente cliente) {

        if (cliente.getTipoConta().equals(TipoConta.PJ)) {
            int id = 0;
            for (int i = 0; i < clientesPj.length; i++) {
                if (clientesPj[i] == null) {
                    id = i;
                    break;
                }
            }
            clientesPj[id] = cliente;
        }
        return cliente;
    }

    public static Cliente[] getClientesPj() {
        return clientesPj;
    }

}