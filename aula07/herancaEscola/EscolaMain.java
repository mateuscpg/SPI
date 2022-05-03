package br.uniesp.poo.aula07.herancaEscola;

import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Mateus", "704.308.674-05", new Date());
        System.out.println("ALUNO: ");
        System.out.println(aluno.nome);
        System.out.println(aluno.cpf);
        System.out.println(aluno.data_nascimento.toString());
        System.out.println("------------");


        System.out.println(aluno.tirarCopia(3));
        Professor professor = new Professor("Thiago", "111.111.111-01", new Date());
        System.out.println(professor.tirarCopia(3));

    }
}
