package com.rendersonjunior.tdd.calculoSalario.service;

import com.rendersonjunior.tdd.calculoSalario.enumerate.Cargo;
import com.rendersonjunior.tdd.calculoSalario.model.Funcionario;

public class CalculadoraDeSalario {

    public Double calculaSalario(final Funcionario funcionario) {
        if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            if (funcionario.getSalario() > 3000) return 3200.0;
            return 1350.0;
        }
        return 425.0;
    }

}
