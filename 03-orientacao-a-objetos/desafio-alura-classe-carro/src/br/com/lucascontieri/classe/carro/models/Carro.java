package br.com.lucascontieri.classe.carro.models;

public class Carro {
    private String modelo;
    private double precoAno01;
    private double precoAno02;
    private double precoAno03;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPreco(double precoAno01, double precoAno02, double precoAno03) {
        this.precoAno01 = precoAno01;
        this.precoAno02 = precoAno02;
        this.precoAno03 = precoAno03;
    }

    public void exibirInformacoes() {
        String mensagem = """
                Modelo do Carro: %s
                Preço do carro 1º ano: %.2f
                Preço do carro 2º ano: %.2f
                Preço do carro 3º ano: %.2f
                """.formatted(this.modelo, this.precoAno01, this.precoAno02, this.precoAno03);
        System.out.println(mensagem);
        System.out.println("Menor peço, é: R$ " + calculaMenorPreco());
        System.out.println("Menor peço, é: R$ " + calculaMaiorPreco());
    }

    public double calculaMenorPreco() {
        double menorPreco = this.precoAno01;

        if (precoAno02 < precoAno01) {
            menorPreco = this.precoAno02;
        }
        if (precoAno03 < precoAno02) {
            menorPreco = precoAno03;
        }
        return menorPreco;
    }

    public double calculaMaiorPreco() {
        double maiorPreco = this.precoAno01;

        if (precoAno02 > precoAno01) {
            maiorPreco = this.precoAno02;
        }
        if (precoAno03 > precoAno01) {
            maiorPreco = precoAno03;
        }
        return maiorPreco;
    }
}
