package com.rendersonjunior.tdd.calculoSalario;

public class CalculadoraDeSalario {

    public Double calculaSalario(final Funcionario funcionario) {
        if (funcionario.getSalario() > 3000) return 3200.0;
        return 1350.0;
    }

}
