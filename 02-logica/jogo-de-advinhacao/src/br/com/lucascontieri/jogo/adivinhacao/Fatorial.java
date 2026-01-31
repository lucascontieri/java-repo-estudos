package br.com.lucascontieri.jogo.adivinhacao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero = 0;
        int fatorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para calcular seu fatorial:");
        numero = sc.nextInt();

        for (int i = 1; i <= numero ; i++) {
            fatorial *=  i;
        }

        System.out.println(String.format("O fatorial de %d, é: %d",numero, fatorial ));
    }
}
