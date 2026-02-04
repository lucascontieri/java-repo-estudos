package br.com.contieri.primeiroprogramajava;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");


        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada pelas 3 notas do Jack, Paulo e Suellen
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun 
                Filme de Aventura dos anos 80
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        String nomePlataforma = "Alura";
        double qtdHorasEstudo = 2.5;

        String msg = """
                Curso da %s
                Estou testando a saída de dados usando o Text Block
                Para formatar os textos utilizamos o método format() da
                classe String, nesse método é permitido formatar um texto
                utilizando diversos placeholders que possui os seguintes 
                caracteres combinados com as letras que representam o tipo de
                dado que será inserido no placeholder.
                %%s = representa uma String
                %%d = representa um valor inteiro
                %%f = representa um valor com ponto flutuante
                Irei focar nos estudos na plataforma por pelo menos %f por dia.
                """.formatted(nomePlataforma, qtdHorasEstudo);

        System.out.println(msg);

        int classificacao = (int) (media / 2); // fazendo a conversão explicitamente pelo Casting
        System.out.print(classificacao);


    }
}