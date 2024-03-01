package com.appBanco.model;

import java.util.Date;

public class Cpf {

    private int valor;
    private Date dataEmissao;

    public Cpf(int valor, Date dataEmissao) {
        this.valor = valor;
        this.dataEmissao = dataEmissao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

}
