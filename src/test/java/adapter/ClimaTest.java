package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimaTest {

    @Test
    void deveRetornarFaixaTemperaturaClima() {
        Clima clima = new Clima();
        clima.setTemperatura("Muito Quente");

        assertEquals("Muito Quente", clima.getTemperatura());
    }

    @Test
    void deveRetornarGrausCelsiusClima() {
        Clima clima = new Clima();
        clima.setTemperatura("Muito Quente");

        assertEquals(35.0f, clima.getGrausCelsius());
    }

}
