package br.uniesp.poo.aula03;

import java.util.Scanner;

public class cervejas {
    public static void main(String[] args) {

        int skol = 99;
        Scanner leitor = new Scanner(System.in);

        while (skol > 0){
            System.out.println(skol);
            skol -= 1;
            System.out.println("Pego uma garrafa da freezer \nagora tem "+skol+"");

            if (skol == 1){
                System.out.println("Acabou a cerveja meu parça! Vai incluir quantas mais?");
                skol = leitor.nextInt();
                if (skol > 0 ){
                    System.out.println("Foram incluídas " +skol+ " cervejas");
                }
            }
        }
        System.out.println("Acabou a festa!");
    }
}
