package br.uniesp.poo.aula07.herancaVeiculo;

public class Veiculo {
    public String marca;
    public String modelo;

    public  Veiculo(){
    }

    public Veiculo(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public void tipoVeiculo(){
        System.out.println("O Veículo é um carro ou moto");
    }
}
