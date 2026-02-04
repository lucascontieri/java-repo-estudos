import br.com.contieri.classe.carro.models.ModeloCarro;

public class Main {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.setModelo("Vectra");
        meuCarro.definirPreco(30000, 36500, 410000);
        meuCarro.exibirInformacoes();
        meuCarro.calculaMenorPreco();
        meuCarro.calculaMenorPreco();
    }
}
