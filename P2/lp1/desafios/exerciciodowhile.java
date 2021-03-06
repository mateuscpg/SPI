package br.uniesp.poo.desafios;

import java.util.Scanner;

public class exerciciodowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, quantLidos = 0, soma = 0;
        int quantPosit = 0, quantNeg = 0;

        do {
            System.out.print("Informe um número inteiro (0 para sair): ");
            numero = Integer.parseInt(entrada.nextLine());

            if(numero > 0){
                quantPosit++;
            }
            else if(numero < 0){
                quantNeg++;
            }

            soma += numero;

            if(numero != 0){
                quantLidos++;
            }
        }
        while(numero != 0);

        if(quantLidos == 0){
            System.out.println("Você não informou nenhum número.");
        }
        else{
            System.out.println("Quantidade de números positivos: " + quantPosit);
            System.out.println("Quantidade de números negativos: " + quantNeg);
            System.out.println("A soma dos números lidos é: " + soma);
            System.out.println("A média aritmética é: " + ((soma * 1.0) / quantLidos));
        }
    }
}

