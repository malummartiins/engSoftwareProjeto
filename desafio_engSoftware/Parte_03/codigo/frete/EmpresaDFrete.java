package frete;

import domain.Endereco;
import domain.Exemplar;

public class EmpresaDFrete implements FreteStrategy {
    @Override
    public double calcular(Endereco endereco, Exemplar exemplar) {
        return 10.5;
    }
}