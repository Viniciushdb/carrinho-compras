# Sistema de Carrinho de Compras

Este é um sistema simples de carrinho de compras desenvolvido em Java, seguindo os princípios de Programação Orientada a Objetos (POO).

## Funcionalidades

- Cadastro de produtos
- Adição de itens ao carrinho
- Visualização da fatura
- Cálculo automático de valores

## Estrutura do Projeto

O projeto é composto por 4 classes principais:

- `Produto`: Representa um produto com nome, código e preço
- `Item`: Representa um item na fatura com produto, quantidade e valor total
- `Fatura`: Gerencia a lista de itens e calcula o valor total
- `Main`: Classe principal com o menu interativo

## Como Executar

1. Certifique-se de ter o Java instalado em sua máquina
2. Compile todos os arquivos .java:
   ```
   javac *.java
   ```
3. Execute a classe Main:
   ```
   java Main
   ```

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- ArrayList para gerenciamento de itens