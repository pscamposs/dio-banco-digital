package me.patrick.bank;


import me.patrick.bank.account.Conta;
import me.patrick.bank.account.ContaCorrente;
import me.patrick.bank.account.ContaPoupanca;

public class Main {


    public static void main(String[] args) {


        Conta corrente = new ContaCorrente();
        corrente.depositar(200);

        corrente.imprimirExtrato();


        Conta poupanca = new ContaPoupanca();
        poupanca.imprimirExtrato();
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
