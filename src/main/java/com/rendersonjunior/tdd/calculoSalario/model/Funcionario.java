package com.rendersonjunior.tdd.calculoSalario.model;

import com.rendersonjunior.tdd.calculoSalario.enumerate.Cargo;

public class Funcionario {

    private String nome;
    private Double salario;
    private Cargo cargo;

    public Funcionario(final String nome, final Double salario, final Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

}
