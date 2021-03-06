package br.uniesp.poo.desafios;

import java.util.Scanner;

public class exerciciowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tentativas = 0, numLido;
        boolean acertou = false;
        int num = (int)(Math.random() * 11);

        while(!acertou){
            System.out.print("Informe um número de 0 a 10: ");
            numLido = Integer.parseInt(entrada.nextLine());
            tentativas++;

            if(numLido == num){
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                acertou = true;

            }else if(numLido < num){
                System.out.println("Errou! Tente um número maior.");

            }else{
                System.out.println("Errou! Tente um número menor.");
            }
        }
    }
}
