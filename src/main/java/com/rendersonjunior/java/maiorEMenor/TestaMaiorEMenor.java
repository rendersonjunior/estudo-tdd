package com.rendersonjunior.java.maiorEMenor;

import org.junit.Test;

public class TestaMaiorEMenor {
    @Test
    public void ordemDecrescente() {
        final var carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));

        final var algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);

        System.out.println("O menor produto: ".concat(algoritmo.getMenor().getNome()));
        System.out.println("O maior produto: ".concat(algoritmo.getMaior().getNome()));
    }

    @Test
    public void ordemCrescente() {
        final var carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));

        final var algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);

        System.out.println("O menor produto: ".concat(algoritmo.getMenor().getNome()));
        System.out.println("O maior produto: ".concat(algoritmo.getMaior().getNome()));
    }

    public static void main(String[] args) {
    }

}
