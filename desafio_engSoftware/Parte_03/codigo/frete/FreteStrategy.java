package frete;

import domain.Endereco;
import domain.Exemplar;

public interface FreteStrategy {
    double calcular(Endereco endereco, Exemplar exemplar);
}