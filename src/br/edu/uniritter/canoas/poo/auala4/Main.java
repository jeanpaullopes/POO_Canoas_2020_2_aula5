package br.edu.uniritter.canoas.poo.auala4;

public class Main {

    public static void main(String[] args) {
        ATM caixaEletronico = new ATM();
        ATM caixaEletronico2 = new ATM();
        caixaEletronico.addContaCorrente(new ContaCorrente(1,1,0,new Cliente("Jorge","12345678")));
        caixaEletronico.addContaCorrente(new ContaCorrente(2,1,0,new Cliente("Maria","12345678")));
        caixaEletronico.addContaCorrente(new ContaCorrente(3,1,0,new Cliente("Willian","12345678")));
        caixaEletronico2.addContaCorrente(new ContaCorrente(1,2,0,new Cliente("Gabriel","12345678")));
        caixaEletronico2.addContaCorrente(new ContaCorrente(2,2,0,new Cliente("marino","12345678")));
        caixaEletronico2.addContaCorrente(new ContaCorrente(3,2,0,new Cliente("Carolina","12345678")));


        caixaEletronico.iniciar();
        caixaEletronico2.iniciar();
        caixaEletronico.iniciar();

/*
        Cliente cli = new Cliente("jean", "999999999");
        ContaCorrente conta1 = new ContaCorrente(1234,5678,100,cli);
        System.out.println(conta1);
        conta1.depositar(1000);
        System.out.println(conta1);
        if (conta1.sacar(200)) {
            System.out.println("saque realizado com sucesso!");
        } else {
            System.out.println("saque não realizado. contate seu banco.");
        }

        System.out.println(conta1);

        if (conta1.sacar(3000)){
            System.out.println("saque realizado com sucesso!");
        } else {
            System.out.println("saque não realizado. contate seu banco.");
        }
        System.out.println(conta1);
        conta1.imprimirExtrato();
*/

    }
}
