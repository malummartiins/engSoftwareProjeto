# 📚 Desafio de Modelagem e Design OO - Biblioteca

Este repositório contém a solução completa para um desafio dividido em três partes, envolvendo **modelagem UML**, **análise de estados** e **aplicação de padrão de projeto (Strategy)** em Java. O projeto simula funcionalidades de um sistema de biblioteca.

## 📌 Estrutura do Desafio

| Parte | Tema                                   | Entrega                           |
|-------|----------------------------------------|-----------------------------------|
| 01    | Diagrama de Sequência (Renovar Empréstimo) | PlantUML (.png + .txt)            |
| 02    | Diagrama de Estados (Entidade Livro)       | PlantUML (.png + .txt)            |
| 03    | Refatoração com Padrão Strategy             | UML + Código Java + Teste em Main |

---

## 🧩 Parte 1 - Diagrama de Sequência

Modela o fluxo de renovação de um empréstimo de livro, levando em conta:

- Verificação de reserva
- Verificação de atraso
- Pagamento de multa via Pix (simulado)
- Separação por camadas (Boundary-Control-Entity)

📂 Local: `Parte_01/`

---

## 🔄 Parte 2 - Diagrama de Estados

Modela os diversos estados que um **Livro** pode assumir:

- Disponível
- Emprestado
- Atrasado
- Reservado
- Em Inspeção

📂 Local: `Parte_02/`

---

## 🛠️ Parte 3 - Padrão Strategy no Cálculo de Frete

Refatoração do método `calcularFrete()` da classe `Emprestimo`, substituindo `if-else` por uma implementação com o padrão **Strategy**. Permite que novas empresas de entrega sejam adicionadas de forma flexível e sem alterar código existente.

📂 Local: `Parte_03/`

### 🗂 Estrutura do código Java


---

## 🧪 Teste

A classe `Main` instancia objetos com dados simulados e imprime o valor do frete calculado para cada empresa de entrega.

---

## 💡 Tecnologias Utilizadas

- [PlantUML](https://plantuml.com/)
- Java 17+
- Padrão de Projeto Strategy (GoF)

---

## 🧾 Licença

Este projeto foi desenvolvido com fins educacionais.

---

## ✍️ Autor

Desenvolvido como parte do desafio de uma disciplina de Engenharia de SOftware: Projetos - Unisinos.



