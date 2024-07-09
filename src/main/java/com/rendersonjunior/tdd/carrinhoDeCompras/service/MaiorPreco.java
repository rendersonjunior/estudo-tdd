package com.rendersonjunior.tdd.carrinhoDeCompras.service;

public class MaiorPreco {

    public Double encontra(final CarrinhoDeCompras carrinho) {
        if (carrinho.getItens().size() == 0) {
            return  0.0;
        }
        return carrinho.getItens().get(0).getValorTotal();
    }

}
