package domain;

import frete.FreteStrategy;

public class Emprestimo {
    private Usuario usuario;
    private Exemplar exemplar;
    private Endereco endereco;
    private FreteStrategy freteStrategy;

    public Emprestimo(Usuario usuario, Exemplar exemplar, Endereco endereco) {
        this.usuario = usuario;
        this.exemplar = exemplar;
        this.endereco = endereco;
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public double calcularFrete() {
        return freteStrategy.calcular(endereco, exemplar);
    }
}