package br.uniesp.poo.aula07.abstrata;

abstract class Conta {
    private double saldo;

    public  void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public abstract void imprimeExtrato();

}
