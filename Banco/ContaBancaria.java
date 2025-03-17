package ContaBancaria;

import Pessoa.Pessoa;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private Pessoa titular;

    public ContaBancaria(String numeroConta, double saldo, Pessoa titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Valor invalido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            System.out.println("Valor invalido para saque");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void exibirInformacoes() {
        System.out.println("Conta: " + numeroConta);
        titular.exibirInfo();
        exibirSaldo();
    }
}
