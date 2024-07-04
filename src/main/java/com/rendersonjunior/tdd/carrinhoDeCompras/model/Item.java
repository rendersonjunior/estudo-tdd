package com.rendersonjunior.tdd.carrinhoDeCompras.model;

public class Item {

    private final String descricao;
    private final int quantidade;
    private final Double valorUnitario;

    public Item(final String descricao,
                final int quantidade,
                final Double valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    private Double getValorTotal() {
        return this.valorUnitario * this.quantidade;
    }

}
