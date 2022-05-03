package br.uniesp.poo.aula07.abstrata;

public class ContaPoupanca extends Conta{
    @Override
    public void imprimeExtrato(){
        System.out.println(getSaldo());
    }
}
