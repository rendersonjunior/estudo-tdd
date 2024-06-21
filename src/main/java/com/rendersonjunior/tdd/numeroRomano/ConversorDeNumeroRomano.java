package com.rendersonjunior.tdd.numeroRomano;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {

    /*
    private static Map<String, Integer> tabela = new HashMap<>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};
    */

    public Integer converte(final String numeroEmRomano) {
        Integer acumulador = 0;
        for (int i = 0; i < numeroEmRomano.length(); i++) {
            acumulador += EnumTabelaNumeroRomano.buscarNumeroDecimal(String.valueOf(numeroEmRomano.charAt(i)));
        }
        return acumulador;
    }

}
