package com.rendersonjunior.tdd.numeroRomano;

import com.rendersonjunior.tdd.numeroRomano.service.ConversorDeNumeroRomano;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumeroRomanoTest {

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

    @Test
    public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
        final ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        final int numero = romano.converte("XXII");
        assertEquals(22, numero);
    }

    @Test
    public void deveEntenderNumerosComoIX() {
        final ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        final int numero = romano.converte("IX");
        assertEquals(9, numero);
    }

    @Test
    public void deveEntenderNumerosComplexosComoXXIV() {
        final ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        final int numero = romano.converte("XXIV");
        assertEquals(24, numero);
    }

}
