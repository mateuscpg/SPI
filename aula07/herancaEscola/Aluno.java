package br.uniesp.poo.aula07.herancaEscola;

import java.util.Date;

public class Aluno extends Pessoa{

    public Aluno(String nome, String cpf, Date data_nacimento){
        super(nome, cpf, data_nacimento);
    }
    public String matricula;

    public double tirarCopia(int qntd){
        return 0.07 * (double) qntd;
    }
}
