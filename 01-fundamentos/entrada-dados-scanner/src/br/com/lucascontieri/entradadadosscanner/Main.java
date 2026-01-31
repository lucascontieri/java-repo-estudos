package br.com.lucascontieri.entradadadosscanner;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            String letra;

            do {
                System.out.println(" Digite uma letra: ");
                letra = teclado.next();
                System.out.println("A letra  digitada foi: "+ letra);
            } while (letra != "f");

            System.out.println("fim do programa");
        }
}