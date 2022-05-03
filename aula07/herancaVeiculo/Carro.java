package br.uniesp.poo.aula07.herancaVeiculo;

public class Carro extends Veiculo {
    public int porta;

    public Carro (String marca, String modelo, int porta){
        super(modelo, marca);
        this.porta = porta;
    }

}
