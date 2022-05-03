package br.uniesp.poo.aula05;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nomeLivro = "Use a cabeça!Java";
        livro.valorLivro = 100.50;
        livro.dataPublicacao = "10/03/2000";

       livro.printEmTela();

    }
}
