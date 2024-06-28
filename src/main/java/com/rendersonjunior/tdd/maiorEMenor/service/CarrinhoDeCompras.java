package com.rendersonjunior.tdd.maiorEMenor.service;

import com.rendersonjunior.tdd.maiorEMenor.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Produto> produtoList;

    public CarrinhoDeCompras() {
        this.produtoList = new ArrayList<>();
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void adiciona(Produto produto) {
        this.produtoList.add(produto);
    }

}
