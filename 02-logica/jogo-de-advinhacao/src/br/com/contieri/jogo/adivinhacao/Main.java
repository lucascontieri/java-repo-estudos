package br.com.contieri.jogo.adivinhacao;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int numero = 0;
        int tentativas = 0;

        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Advinhe o número sorteado de 0 a 100: Com no máximo 5 tentativas! ");
            numero = sc.nextInt();

            tentativas += 1;

            if(numero == numeroAleatorio) {
                System.out.println(String.format("Parabéns você  acertou o número: %d", numeroAleatorio));
                break;
            } else if (numero < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número gerado!");
            } else {
                System.out.println("O número digitado é maior que o número gerado!");
            }
        }

        if (tentativas == 5 && numero != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
        }
    }
}