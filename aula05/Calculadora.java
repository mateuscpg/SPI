package br.uniesp.poo.aula05;

public class Calculadora {

    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int somar(){
        return getNumero1() + getNumero2();
    }

    public int subtrair(){
        return getNumero1()-getNumero2();
    }

    public int multiplicar(){
        return getNumero1()*getNumero2();
    }

    public double divisao(){
        return getNumero1()/getNumero2();
    }

    public int somarNumeroMaiorQueDez(int i, int i1) {
        if (i > 10 && i1 > 10) {
            System.out.println("Somei");
            return i + i1;
        } else {
            System.out.println("não somei");
            return 0;
        }
    }
}

