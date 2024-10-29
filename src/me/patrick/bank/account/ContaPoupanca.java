package me.patrick.bank.account;

public class ContaPoupanca extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta poupança:");
        imprimirInformacoesComuns();
    }
}
