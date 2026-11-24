package adapter;

public class TemperaturaAdapter extends TemperaturaCelsius {

    private ITemperatura temperaturaFaixa;

    public TemperaturaAdapter(ITemperatura temperaturaFaixa) {
        this.temperaturaFaixa = temperaturaFaixa;
    }

    public String recuperarTemperatura() {
        if (this.getGrausCelsius() >= 35.0f)
            temperaturaFaixa.setTemperatura("Muito Quente");
        else
            if (this.getGrausCelsius() >= 28.0f)
                temperaturaFaixa.setTemperatura("Quente");
            else
                if (this.getGrausCelsius() >= 20.0f)
                    temperaturaFaixa.setTemperatura("Agradável");
                else
                    temperaturaFaixa.setTemperatura("Frio");
        return temperaturaFaixa.getTemperatura();
    }

    public void salvarTemperatura() {
        if (temperaturaFaixa.getTemperatura().equals("Muito Quente"))
            this.setGrausCelsius(35.0f);
        else
            if (temperaturaFaixa.getTemperatura().equals("Quente"))
                this.setGrausCelsius(28.0f);
            else
                if (temperaturaFaixa.getTemperatura().equals("Agradável"))
                    this.setGrausCelsius(20.0f);
                else
                    this.setGrausCelsius(10.0f);
    }
}
