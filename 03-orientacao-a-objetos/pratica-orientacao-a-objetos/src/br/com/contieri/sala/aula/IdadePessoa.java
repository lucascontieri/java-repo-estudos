package br.com.contieri.sala.aula;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int verificarIdade (int idade) {
        if (idade <= 0) {
            System.out.println("Idade Inválida!");
        } else if (idade <= 17) {
            System.out.println("Menor de idade!");
        } else {
            System.out.println("Maior de idade!");
        }
        return idade;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade " + idade);
    }
}
