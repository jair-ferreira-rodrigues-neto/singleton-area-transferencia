package org.example;

public class AreaDeTransferencia {

    private static AreaDeTransferencia instancia;
    private String conteudo;

    private AreaDeTransferencia() {
        this.conteudo = "";
    }

    public static AreaDeTransferencia getInstancia() {
        if (instancia == null) {
            instancia = new AreaDeTransferencia();
        }
        return instancia;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}