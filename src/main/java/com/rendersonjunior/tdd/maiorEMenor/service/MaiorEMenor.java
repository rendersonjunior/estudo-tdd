package com.rendersonjunior.tdd.maiorEMenor.service;

import com.rendersonjunior.tdd.maiorEMenor.model.Produto;

import static java.util.Objects.isNull;

public class MaiorEMenor {

    private Produto menor;
    private Produto maior;

    public void encontra(CarrinhoDeCompras carrinho) {
        for (final var produto : carrinho.getProdutoList()) {
            if (isNull(menor) || produto.getValor() < menor.getValor()) {
                menor = produto;
            }
            if (isNull(maior) || produto.getValor() > maior.getValor()) {
                maior = produto;
            }
        }
    }

    public Produto getMenor() {
        return menor;
    }

    public Produto getMaior() {
        return  maior;
    }

}
