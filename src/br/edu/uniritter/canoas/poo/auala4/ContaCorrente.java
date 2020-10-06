package br.edu.uniritter.canoas.poo.auala4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ContaCorrente {
    protected  int numero;
    protected  int agencia;
    protected  float saldo;
    protected  Cliente cliente;
    protected List<Operacao> movimentos;

    //Construtor de objeto em branco
    public ContaCorrente() {

    }

    //Construtor com 4 parametros de entrada
    public ContaCorrente(int numero, int agencia, float saldoInicial, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.movimentos = new ArrayList<>();
        this.depositar(saldoInicial);

    }
    public ContaCorrente(int numero, int agencia,Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.movimentos = new ArrayList<>();
        //this.depositar(saldoInicial);

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void depositar(float valor) {
        Deposito dep = new Deposito(valor);
        this.movimentos.add(dep);
        this.saldo += valor;
        //this.valor = this.valor + valor;
    }
    public boolean sacar(float valor) {
        boolean retorno = false;
        if (getSaldo() >= valor) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Você está prestes a sacar, confirma? 1.Sim ");
            int i = scan.nextInt();
            if (i == 1) {
                Saque saque = new Saque(valor);
                this.movimentos.add(saque);
                this.saldo = this.saldo - valor;
            }
            retorno = true;
        }
        return retorno;
    }

    public void imprimirExtrato() {
        for (int i = 0; i < this.movimentos.size(); i++) {
            System.out.println(this.movimentos.get(i).getDescricao()+"\n");
        }
    }
    @Override
    public String toString() {
        String ret = "";
        if (this.cliente == null) {
            ret = "Conta ainda não iniciazada.";
        } else {
            ret = "conta/Agência: "+this.numero+"/"+this.agencia+" - Cliente: "+this.cliente.getNome()+" saldo: "+this.saldo;
        }
        return ret;
    }
}
