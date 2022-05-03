package br.uniesp.poo.aula07.abstrata;

public class Main {
    public static void main(String[] args) {
        Conta conta = new ContaPoupanca();
        conta.setSaldo(2121);
        conta.imprimeExtrato();
    }
}
