package com.rendersonjunior.tdd.numeroRomano;

public enum EnumTabelaNumeroRomano {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    EnumTabelaNumeroRomano(Integer decimal) {
        this.decimal = decimal;
    }

    private final Integer decimal;

    public static Integer buscarNumeroDecimal(final String numeroRomano) {
        return EnumTabelaNumeroRomano.valueOf(numeroRomano).buscarDecimal();
    }

    public Integer buscarDecimal() {
        return this.decimal;
    }

}
