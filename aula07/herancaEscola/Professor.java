package br.uniesp.poo.aula07.herancaEscola;

import java.util.Date;

public class Professor extends Pessoa{

    public Professor(String nome, String cpf, Date data_nascimento){
        super(nome, cpf, data_nascimento);
    }
    public double salario;
    public String disciplina;


}
