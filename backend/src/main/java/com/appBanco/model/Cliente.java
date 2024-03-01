package com.appBanco.model;

import java.util.ArrayList;

public class Cliente {

    private int id;
    private String nome;
    private Rg rg;
    private Cpf cpf;
    private ArrayList<Telefone> telefones;

    public Cliente(String nome, Rg rg, Cpf cpf, ArrayList<Telefone> telefones) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefones = telefones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Rg getRg() {
        return rg;
    }

    public void setRg(Rg rg) {
        this.rg = rg;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

}
