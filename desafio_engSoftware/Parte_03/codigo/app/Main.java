package app;

import domain.Emprestimo;
import domain.Usuario;
import domain.Endereco;
import domain.Exemplar;
import frete.*;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João");
        Endereco endereco = new Endereco("Rua das Flores", "123", "São Paulo", "SP");
        Exemplar exemplar = new Exemplar("Dom Casmurro", 1.2, 20, 15, 5);

        FreteStrategy[] estrategias = {
            new EmpresaAFrete(),
            new EmpresaBFrete(),
            new EmpresaCFrete(),
            new EmpresaDFrete()
        };

        for (FreteStrategy estrategia : estrategias) {
            Emprestimo emprestimo = new Emprestimo(usuario, exemplar, endereco);
            emprestimo.setFreteStrategy(estrategia);
            System.out.printf("Frete (%s): R$ %.2f%n",
                estrategia.getClass().getSimpleName(), emprestimo.calcularFrete());
        }
    }
}