package br.edu.uniritter.canoas.poo.auala4;

public class Cliente {
    private String nome;
    private String fone;

    public Cliente() {

    }

    public Cliente(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
