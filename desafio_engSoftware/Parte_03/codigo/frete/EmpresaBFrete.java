package frete;

import domain.Endereco;
import domain.Exemplar;

public class EmpresaBFrete implements FreteStrategy {
    @Override
    public double calcular(Endereco endereco, Exemplar exemplar) {
        return 12.0;
    }
}