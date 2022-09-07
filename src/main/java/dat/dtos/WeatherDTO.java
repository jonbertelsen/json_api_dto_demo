package dat.dtos;

public class WeatherDTO {
    private final CurrentDataDTO CurrentData;
    private final String LocationName;

    public WeatherDTO(CurrentDataDTO currentData, String locationName) {
        CurrentData = currentData;
        LocationName = locationName;
    }

    public CurrentDataDTO getCurrentData() {
        return CurrentData;
    }

    public String getLocationName() {
        return LocationName;
    }

    @Override
    public String toString() {
        return "WeatherDTO{" +
                "CurrentData=" + CurrentData +
                ", LocationName='" + LocationName + '\'' +
                '}';
    }
}
