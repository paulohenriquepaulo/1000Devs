package exercicios.sistemaBanco.model;


public class ClientePJ extends  Cliente{

    private String cnpj;
    private String[] socios = new String[3];

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String[] getSocios() {
        return socios;
    }

    public void setSocios(String[] socios) {
        this.socios = socios;
    }
}
