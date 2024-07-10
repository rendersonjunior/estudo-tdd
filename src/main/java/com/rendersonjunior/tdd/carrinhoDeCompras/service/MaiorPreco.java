package com.rendersonjunior.tdd.carrinhoDeCompras.service;

import com.rendersonjunior.tdd.carrinhoDeCompras.model.Item;

public class MaiorPreco {

    public Double encontra(final CarrinhoDeCompras carrinho) {
        return carrinho.getItens().stream()
                .map(Item::getValorTotal)
                .max(Double::compareTo)
                .orElse(0.0);
    }

}
