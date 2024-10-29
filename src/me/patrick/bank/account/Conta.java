package me.patrick.bank.account;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;


    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
    }

    protected void imprimirInformacoesComuns() {
        System.out.println(String.format("Agência: %d", getAgencia()));
        System.out.println(String.format("Número: %d", getNumero()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
