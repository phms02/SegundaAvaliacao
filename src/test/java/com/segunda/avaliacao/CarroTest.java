package com.segunda.avaliacao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {
    @Test
    public void testGettersAndSetters() {
        Carro carro = new Carro("Ferrari", "Corolla", 2022, 65000.0);
        assertEquals("Toyota", carro.getMarca());
        assertEquals("Corolla", carro.getModelo());
        assertEquals(2022, carro.getAnoFabricacao());
        assertEquals(65000.0, carro.getPreco());
        assertEquals(false, carro.isVendido());

        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setAnoFabricacao(2023);
        carro.setPreco(70000.0);
        carro.venderCarro();

        assertEquals("Honda", carro.getMarca());
        assertEquals("Civic", carro.getModelo());
        assertEquals(2023, carro.getAnoFabricacao());
        assertEquals(70000.0, carro.getPreco());
        assertEquals(true, carro.isVendido());
    }

    @Test
    public void testExibirInformacoes() {
        Carro carro = new Carro("Ford", "Fiesta", 2021, 50000.0);
        carro.exibirInformacoes();
    }
}