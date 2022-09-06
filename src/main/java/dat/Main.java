package dat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dat.dtos.WeatherDTO;
import dat.utils.HttpUtils;

public class Main
{
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args)
    {
        System.out.println("Hello REST API world!");
        String json = HttpUtils.fetchAPIData("https://vejr.eu/api.php?location=Roskilde&degree=C");
        System.out.println(json);
        WeatherDTO weatherDTO = gson.fromJson(json,WeatherDTO.class);
        System.out.println(gson.toJson(weatherDTO));
        System.out.println(weatherDTO.toString());
    }
}