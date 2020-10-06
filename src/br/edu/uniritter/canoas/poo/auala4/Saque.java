package br.edu.uniritter.canoas.poo.auala4;

import java.util.Calendar;

public class Saque extends Operacao {

    public Saque(float valor) {
        super();
        this.data = Calendar.getInstance().getTime();
        this.valor = -valor;
}
    @Override
    public String getDescricao() {
        return "Saque: "+this.valor;
    }
}


