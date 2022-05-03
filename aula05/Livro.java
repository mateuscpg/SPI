package br.uniesp.poo.aula05;

public class Livro {
    String nomeLivro;
    Double valorLivro;
    String dataPublicacao;

    public void printEmTela(){
        System.out.println("Nome do livro: "+ nomeLivro);
        System.out.println("Valor do livro: "+ valorLivro);
        System.out.println("Data publicação do livro: "+dataPublicacao);
    }

}
