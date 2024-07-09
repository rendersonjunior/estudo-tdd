package com.rendersonjunior.tdd.carrinhoDeCompras;

import com.rendersonjunior.tdd.carrinhoDeCompras.model.MaiorPreco;
import com.rendersonjunior.tdd.carrinhoDeCompras.service.CarrinhoDeCompras;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarrinhoDeComprasTest {

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
        final var carrinho = new CarrinhoDeCompras();

        final var algoritmo = new MaiorPreco();
        final var valor = algoritmo.encontra(carrinho);

        assertEquals(0.0, valor, 0.0001);
    }

}
