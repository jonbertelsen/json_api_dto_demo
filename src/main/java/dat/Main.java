package dat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dat.dtos.UsersDTO;
import dat.dtos.WeatherDTO;
import dat.utils.HttpUtils;

public class Main
{
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args)
    {
        // weatherAPI();
        userAPI();

    }

    public static void userAPI()
    {
        System.out.println("Hello USER REST API world!");
        String json = HttpUtils.fetchAPIData("https://dummyapi.io/data/v1/user", "63174ee165bb0b2aa17b0119");
        UsersDTO usersDTO = gson.fromJson(json, UsersDTO.class);
        System.out.println(gson.toJson(usersDTO));
    }

    public static void weatherAPI()
    {
        System.out.println("Hello REST API world!");
        String json = HttpUtils.fetchAPIData("https://vejr.eu/api.php?location=Roskilde&degree=C","63174ee165bb0b2aa17b0119");
        System.out.println("JSON som ren tekst");
        System.out.println(json);
        WeatherDTO weatherDTO = gson.fromJson(json, WeatherDTO.class);
        System.out.println("JSON fra DTO");
        System.out.println(gson.toJson(weatherDTO));
        System.out.println("JSON som weatherDTO.toString()");
        System.out.println(weatherDTO.toString());
    }
}