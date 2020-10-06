package br.edu.uniritter.canoas.poo.auala4;

import java.util.ArrayList;

public class ContaEspecial extends ContaCorrente{
    private float limite = 1000;

    public ContaEspecial(int numero, int agencia, float saldoInicial, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.movimentos = new ArrayList<>();
        this.depositar(saldoInicial);

    }
    @Override
    public float getSaldo() {
        return this.saldo + this.limite;
    }
/*
    @Override
    public boolean sacar(float valor) {
        boolean retorno = false;
        if (this.saldo + this.limite >= valor) {
            Saque saque = new Saque(valor);
            this.movimentos.add(saque);
            this.saldo = this.saldo - valor;
            retorno = true;
        }
        return retorno;
    }

 */


}
