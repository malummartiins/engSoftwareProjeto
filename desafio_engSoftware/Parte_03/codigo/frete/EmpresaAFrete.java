package frete;

import domain.Endereco;
import domain.Exemplar;

public class EmpresaAFrete implements FreteStrategy {
    @Override
    public double calcular(Endereco endereco, Exemplar exemplar) {
        return 10.0;
    }
}