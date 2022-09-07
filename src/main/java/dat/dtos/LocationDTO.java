package dat.dtos;

public class LocationDTO {

    private String city, country;
    private double latitude, longitude;

    public LocationDTO(String city, String country, double latitude, double longitude) {
        this.city = city;
        this.country = country;
        this.latitude = longitude;
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "LocationDTO{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
