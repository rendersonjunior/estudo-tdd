package com.rendersonjunior.tdd.carrinhoDeCompras;

import com.rendersonjunior.tdd.carrinhoDeCompras.model.Item;
import com.rendersonjunior.tdd.carrinhoDeCompras.service.CarrinhoDeCompras;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarrinhoDeComprasTest {

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
        final var carrinho = new CarrinhoDeCompras();

        assertEquals(0.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
        final var carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.00));

        assertEquals(900.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        final var carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));

        assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarValorTotalDosProdutosDoCarrinho() {
        final var carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));

        assertEquals(3150.0, carrinho.valorTotal(), 0.0001);
    }

}
