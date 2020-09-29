package br.edu.uniritter.canoas.poo.auala4;

public class Saque extends Operacao {

    public Saque(float valor) {
        super();
        this.valor = -valor;
}
    @Override
    public String getDescricao() {
        return "Saque: "+this.valor;
    }
}


