package adapter;

public class TemperaturaFaixa implements ITemperatura {

    private String faixa;

    @Override
    public String getTemperatura() {
        return this.faixa;
    }

    @Override
    public void setTemperatura(String faixa) {
        this.faixa = faixa;
    }
}
