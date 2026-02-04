package br.com.contieri.tabuada;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcularmos a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println(String.format("Tabuada do número %d", numero));

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d",numero, i, numero * i));
        }
    }
}