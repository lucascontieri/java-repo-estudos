package br.com.contieri.arraylist.main;

import br.com.contieri.arraylist.models.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        Pessoa pessoa03 = new Pessoa();
        Pessoa pessoa02 = new Pessoa();

        pessoa01.setNome("Lucas");
        pessoa01.setIdade(22);

        pessoa02.setNome("Carlos");
        pessoa02.setIdade(33);

        pessoa03.setNome("Simone");
        pessoa03.setIdade(37);

        System.out.println(pessoa01.toString());
        System.out.println(pessoa02.toString());
        System.out.println(pessoa03.toString());

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa01);
        listaDePessoas.add(pessoa02);
        listaDePessoas.add(pessoa03);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());

        System.out.println("Lista de pessoas: " + listaDePessoas);
    }
}
