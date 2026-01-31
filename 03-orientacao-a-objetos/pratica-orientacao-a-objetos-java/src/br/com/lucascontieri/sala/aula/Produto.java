package br.com.lucascontieri.sala.aula;

public class Produto {
    private String nome;
    private double preco;

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        percentual = (percentual / 100) * preco;
        percentual = preco - percentual;
        System.out.println(String.format("O preço do produto %s, agora com o desconto ficou R$%.2f",nome,percentual));
    }
}
