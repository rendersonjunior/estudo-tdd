package com.rendersonjunior.java.maiorEMenor;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtoList;

    CarrinhoDeCompras() {
        this.produtoList = new ArrayList<>();
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void adiciona(Produto produto) {
        this.produtoList.add(produto);
    }

}
