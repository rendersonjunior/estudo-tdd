package com.rendersonjunior.java.maiorEMenor;

public class Produto {
    private String nome;
    private Double valor;

    Produto(final String nome,
            final Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

}
