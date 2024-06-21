package com.rendersonjunior.tdd.numeroRomano;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversorDeNumeroRomanoTest {

    @Test
    public void deveEntenderOSimboloI() {
        final ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        final int numero = romano.converte("I");
        assertEquals(1, numero);
    }

    @Test
    public void deveEntenderOSimboloV() {
        final ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        final int numero = romano.converte("V");
        assertEquals(5, numero);
    }

    @Test
    public void deveEntenderDoisSimbolosComoII() {
        final ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        final int numero = romano.converte("II");
        assertEquals(2, numero);
    }

}
