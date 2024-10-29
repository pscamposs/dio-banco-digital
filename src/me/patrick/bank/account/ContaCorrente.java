package me.patrick.bank.account;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente:");
        imprimirInformacoesComuns();
    }


}
