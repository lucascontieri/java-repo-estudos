package br.com.contieri.sala.aula;

public class Aluno {
    private String nome;
    private double notas;
    private double somaNotas;
    private int qtdNotas;
    private double mediaNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    // Calcular Media

    public void imprimeMedia() {
        System.out.println("A médida das notas é: " + mediaNotas);
    }
}