package edu.br.unoesc.app.aplicacao.entities;

public class Endereco extends User{

    //Possui cep, logradouro, número,  complemento.

    private String cep;

    private  String logradouro;

    private String numero;

    private String complemento;


    public Endereco(String cep, String logradouro, String numero, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
