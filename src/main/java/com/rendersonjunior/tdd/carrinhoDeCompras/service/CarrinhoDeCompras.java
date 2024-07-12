package com.rendersonjunior.tdd.carrinhoDeCompras.service;

import com.rendersonjunior.tdd.carrinhoDeCompras.model.Item;

import java.util.ArrayList;
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

    public Double maiorValor() {
        return this.getItens().stream()
                .map(Item::getValorTotal)
                .max(Double::compareTo)
                .orElse(0.0);
    }

    public Double valorTotal() {
        return this.getItens().stream()
                .map(item -> item.getQuantidade() * item.getValorTotal())
                .reduce(0.0, Double::sum);
    }


}
