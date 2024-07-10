package com.rendersonjunior.tdd.carrinhoDeCompras;

import com.rendersonjunior.tdd.carrinhoDeCompras.model.Item;
import com.rendersonjunior.tdd.carrinhoDeCompras.service.MaiorPreco;
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

    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
        final var carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.00));

        final var algoritmo = new MaiorPreco();
        final var valor = algoritmo.encontra(carrinho);

        assertEquals(900.0, valor, 0.0001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        final var carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));

        final var algoritmo = new MaiorPreco();
        final var valor = algoritmo.encontra(carrinho);

        assertEquals(1500.0, valor, 0.0001);
    }

}
