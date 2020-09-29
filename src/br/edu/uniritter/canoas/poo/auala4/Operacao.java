package br.edu.uniritter.canoas.poo.auala4;

import java.util.Calendar;
import java.util.Date;

public abstract class Operacao {
    protected float valor;
    protected Date data;

    public Operacao() {
        this.data = Calendar.getInstance().getTime();
    }
    public abstract String getDescricao();

}
