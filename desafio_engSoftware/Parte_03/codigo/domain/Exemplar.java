package domain;

public class Exemplar {
    private String titulo;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    public Exemplar(String titulo, double peso, double altura, double largura, double profundidade) {
        this.titulo = titulo;
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }
}