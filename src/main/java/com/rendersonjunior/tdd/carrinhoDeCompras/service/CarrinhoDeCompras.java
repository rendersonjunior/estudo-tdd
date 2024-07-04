package com.rendersonjunior.tdd.carrinhoDeCompras.service;

import com.rendersonjunior.tdd.carrinhoDeCompras.model.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adiciona(final Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

}
