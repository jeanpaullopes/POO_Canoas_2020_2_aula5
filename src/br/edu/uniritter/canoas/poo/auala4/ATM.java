package br.edu.uniritter.canoas.poo.auala4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private List<ContaCorrente> contasCorrente;
    public ATM(){
        this.contasCorrente = new ArrayList<ContaCorrente>();

    }

    private int MenuInicial() {
        System.out.println("bem vindo ao Banco POO");
        System.out.println("1. abrir conta");
        System.out.println("2. acessar conta");
        System.out.println("3. listar contas");
        System.out.println("4. sair");

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("escolha sua opção:");
            opcao = scanner.nextInt();
        } while (opcao <1 || opcao > 4);
        return opcao;
    }
    public void iniciar() {
        int op = 1;
        while(op < 4) {
            op = this.MenuInicial();
            if (op == 1) {
                this.abrirConta();
            }
            if (op == 2) {
                this.operacoesContaCorrente();
            }
            if (op == 3){
                this.listarContas();
            }
            /*
            switch (op) {
                case 1: this.abrirConta();
                        break;
                case 2: this.menuContaCorrente();
                        break;
            }
            1
             */
            //222System.out.println("você escolheu "+op);
        }
    }

    private void operacoesContaCorrente() {
        ContaCorrente conta = this.buscaConta();
        if(conta == null) {
            System.out.println("Conta Inválida");
        } else {
            this.menuContaCorrente(conta);
        }

    }
    public void addContaCorrente(ContaCorrente conta) {
        this.contasCorrente.add(conta);
    }
    private void listarContas() {
        for(ContaCorrente cc : this.contasCorrente) {
            System.out.println(cc);
        }
        //for(int i = 0; i < this.contasCorrente.size(); i++) {
        //    ContaCorrente cc = this.contasCorrente.get(i);
        //    System.out.println(cc);
        //}
    }

    public void abrirConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do Cliente:");
        String nome = scanner.nextLine();
        System.out.println("Informe o telefone do Cliente:");
        String fone = scanner.nextLine();
        System.out.println("Informe o nº da conta:");
        int conta = scanner.nextInt();
        System.out.println("Informe o nº da agência:");
        int ag = scanner.nextInt();
        Cliente cli = new Cliente(nome,fone);
        ContaCorrente cc = new ContaCorrente(conta, ag, 0, cli);
        this.contasCorrente.add(cc);

    }
    public ContaCorrente buscaConta() {
        ContaCorrente conta = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========");
        System.out.println("Informe o numero da conta:");
        int noConta = scanner.nextInt();
        System.out.println("Informe a agência da conta:");
        int ag = scanner.nextInt();
        for(ContaCorrente cc : this.contasCorrente) {
            if(cc.getNumero() == noConta && cc.getAgencia() == ag) {
                conta = cc;
            }
        }
        //for(int i = 0; i < this.contasCorrente.size(); i++) {
        //    ContaCorrente cc = this.contasCorrente.get(i);
        //    if(cc.getNumero() == noConta && cc.getAgencia() == ag) {
        //         conta = cc;
        //    }
        //}
        return conta;
    }
    public int menuContaCorrente(ContaCorrente conta) {
        System.out.println(conta);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Extrato");
        System.out.println("2. Saldo");
        System.out.println("3. Depósito");
        System.out.println("4. Saque");
        int opcao;
        do {
            System.out.println("escolha sua opção:");
            opcao = scanner.nextInt();
        } while (opcao < 1 || opcao > 4);
        if (opcao == 1) {
            conta.imprimirExtrato();
        }
        if (opcao == 2) {
            System.out.println("Saldo da conta: "+conta.getSaldo());

        }
        if(opcao == 3) {
            this.depositar(conta);
        }
        return opcao;
    }
    private void depositar(ContaCorrente conta) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o valor do depósito: ");
        float valor = scanner.nextFloat();
        conta.depositar(valor);


    }
}
// && and e
// || or ou