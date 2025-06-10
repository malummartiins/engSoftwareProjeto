package frete;

import domain.Endereco;
import domain.Exemplar;

public class EmpresaCFrete implements FreteStrategy {
    @Override
    public double calcular(Endereco endereco, Exemplar exemplar) {
        return 11.0;
    }
}