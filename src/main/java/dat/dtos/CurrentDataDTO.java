package dat.dtos;

public class CurrentDataDTO {
    private Integer temperature;
    private final Integer humidity;
    private final String skyText;
    private final String windText;

    public CurrentDataDTO(Integer temperature, Integer humidity, String skyText, String windText) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.skyText = skyText;
        this.windText = windText;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public String getSkyText() {
        return skyText;
    }

    public String getWindText() {
        return windText;
    }

    @Override
    public String toString() {
        return "CurrentDataDTO{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", skyText='" + skyText + '\'' +
                ", windText='" + windText + '\'' +
                '}';
    }
}

