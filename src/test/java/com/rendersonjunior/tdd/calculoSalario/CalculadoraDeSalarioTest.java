package com.rendersonjunior.tdd.calculoSalario;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraDeSalarioTest {

    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {

        final CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        final Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);

        final Double salario = calculadora.calculaSalario(desenvolvedor);

        assertEquals(1500.0 * 0.9, salario, 0.00001);
    }

    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {

        final CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        final Funcionario desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);

        final Double salario = calculadora.calculaSalario(desenvolvedor);

        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

}
