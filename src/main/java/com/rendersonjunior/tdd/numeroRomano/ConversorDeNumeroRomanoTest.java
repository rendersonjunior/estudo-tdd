package com.rendersonjunior.tdd.numeroRomano;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversorDeNumeroRomanoTest {

    @Test
    public void deveEntenderOSimboloI() {
        final ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        assertEquals(1, numero);
    }

}
