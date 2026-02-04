package br.com.contieri.conversaotemperatura;
public class Main {
    public static void main(String[] args) {
        // Escrevendo um programa que converte uma temperatura em Graus Celsius em Fahrenheit

        double temperaturaCelsius = 32.6;

        // Formúla para Conversão para Fahrenheit
        double conversaoFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = """
                    A temperatura informada foi de: %.2fºC, 
                    após a conversão, temos: %.2fºF 
                    """
                    .formatted(temperaturaCelsius, conversaoFahrenheit);

        //System.out.println(mensagem);

        // Criando uma variável do tipo inteiro para exibir a temperatura em Farenheit sem casas decimais

        int tempCasting = (int) conversaoFahrenheit;

        System.out.println(tempCasting);
    }
}