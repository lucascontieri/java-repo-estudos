package br.com.contieri.jogo.adivinhacao;

import java.util.Scanner;

public class ComparacaoDeNumeros {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(String.format("O numero 1: %d, informado é maior que o número 2: %d!",num1,num2 ));
        } else if (num1 < num2) {
            System.out.println(String.format("O numero 1: %d, informado é menor que o número 2: %d!", num1, num2));
        } if (num1 == num2) {
            System.out.println(String.format("O numero 1: %d, informado é igual ao número 2: %d!", num1, num2));

        }
    }
}
