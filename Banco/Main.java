package main;

import ContaBancaria.ContaBancaria;

import Pessoa.Pessoa;

public class Main {

	public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vinicius da Silva Salro", 18);

        ContaBancaria conta = new ContaBancaria("534546", 6000.0, pessoa);

        conta.exibirInformacoes();
        conta.depositar(500.0);
        conta.exibirSaldo();
        conta.sacar(200.0);
        conta.exibirSaldo();
        conta.sacar(1500.0); 
        conta.exibirInformacoes();
    }
}
