package adapter;

public class Clima {

    ITemperatura temperatura;
    TemperaturaAdapter persistencia;

    public Clima() {
        temperatura = new TemperaturaFaixa();
        persistencia = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(String faixa) {
        temperatura.setTemperatura(faixa);
        persistencia.salvarTemperatura();
    }

    public String getTemperatura() {
        return persistencia.recuperarTemperatura();
    }

    // Método apenas para mostrar que está convertendo faixa para graus Celsius através do adaptador
    public float getGrausCelsius() {
        return persistencia.getGrausCelsius();
    }

}
