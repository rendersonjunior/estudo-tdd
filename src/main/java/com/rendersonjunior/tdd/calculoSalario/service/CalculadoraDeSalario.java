package com.rendersonjunior.tdd.calculoSalario.service;

import com.rendersonjunior.tdd.calculoSalario.enumerate.Cargo;
import com.rendersonjunior.tdd.calculoSalario.model.Funcionario;

public class CalculadoraDeSalario {

    public Double calculaSalario(final Funcionario funcionario) {
        if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            if (funcionario.getSalario() > 3000) {
                return funcionario.getSalario() * 0.8;
            }
            return funcionario.getSalario() * 0.9;
        }
        return funcionario.getSalario() * 0.85;
    }

}
