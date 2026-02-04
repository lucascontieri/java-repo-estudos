package br.com.contieri.desafioalurabanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Lucas";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opcoes = 0; // Menu de opcoes

        String msgCliente = """
                         *************************************
                         Nome do titular: %s
                         Tipo de conta: %s
                         Saldo Atual: R$%.2f
                         *************************************
                """.formatted(nome, tipoConta, saldo);
        System.out.println(msgCliente);

        String msgMenu = """
                           --- Escolha sua opção ---
                           1 - Informações bancárias
                           2 - Saque
                           3 - Depósito
                           4 - Sair
                """;

        Scanner scanner = new Scanner(System.in);

        while (opcoes != 4) {
            System.out.println(msgMenu);
            opcoes = scanner.nextInt();

            if (opcoes == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcoes == 2) {
                System.out.println("Qual é o valor que deseja sacar? : R$");
                double valor = scanner.nextDouble();

                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente! Por favor insira uma valor menor que seu saldo atual: " + saldo);
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                }
            } else if (opcoes == 3) {
                System.out.println("Qual é o valor que deseja depositar? : R$");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: R$ " + saldo);
            } else if (opcoes != 4) {
                System.out.println("Opção Inválida!");
            }
        }
    }
}