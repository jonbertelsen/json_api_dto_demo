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
        //weatherAPI();
        userAPI();

    }

    public static void userAPI()
    {
        System.out.println("Hello USER REST API");
        String json = HttpUtils.fetchAPIData("https://dummyapi.io/data/v1/user", "6318370b8733824e8402f913");
        UsersDTO usersDTO = gson.fromJson(json, UsersDTO.class);
        System.out.println(usersDTO);
        System.out.println(gson.toJson(usersDTO));
    }

    public static void weatherAPI()
    {
        System.out.println("Hello REST API weather");
        String json = HttpUtils.fetchAPIData("https://vejr.eu/api.php?location=Roskilde&degree=C",null);
        WeatherDTO weatherDTO = gson.fromJson(json, WeatherDTO.class);
        System.out.println(gson.toJson(weatherDTO));
     }
}