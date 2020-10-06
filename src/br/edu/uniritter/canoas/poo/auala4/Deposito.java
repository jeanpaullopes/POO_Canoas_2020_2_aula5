package br.edu.uniritter.canoas.poo.auala4;

import java.util.Calendar;

public class Deposito extends Operacao {

    public Deposito(float valor) {
        super();
        this.data = Calendar.getInstance().getTime();
        this.valor = valor;


    }
    @Override
    public String getDescricao() {
        return "Depósito: "+this.valor + " data: "+this.data;
    }
}
