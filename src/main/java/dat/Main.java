package dat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dat.dtos.NetworksDTO;
import dat.dtos.UsersDTO;
import dat.dtos.WeatherDTO;
import dat.utils.HttpUtils;

import java.io.FileReader;
import java.io.IOException;

public class Main
{
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final String DUMMY_API_KEY = "6318370b8733824e8402f913";

    public static void main(String[] args) throws IOException {
        //weatherAPI();
        //userAPI();
        citybikeAPI();

    }

    public static void userAPI()
    {
        System.out.println("Hello USER REST API world!");
        String json = HttpUtils.fetchAPIData("https://dummyapi.io/data/v1/user", DUMMY_API_KEY);
        UsersDTO usersDTO = gson.fromJson(json, UsersDTO.class);
        System.out.println(gson.toJson(usersDTO));
    }

    public static void weatherAPI()
    {
        System.out.println("Hello USER REST API world!");
        String json = HttpUtils.fetchAPIData("https://vejr.eu/api.php?location=Roskilde&degree=C", null);

        System.out.println("JSON som ren tekst");
        System.out.println(json);
        System.out.println();

        System.out.println("JSON fra DTO");
        WeatherDTO weatherDTO = gson.fromJson(json, WeatherDTO.class);
        System.out.println(gson.toJson(weatherDTO));

        System.out.println();
        System.out.println("JSON som weatherDTO.toString()");
        System.out.println(weatherDTO.toString());
    }

    public static void citybikeAPI() throws IOException {
        System.out.println("Hello USER REST API world!");
        //String json = HttpUtils.fetchAPIData("http://api.citybik.es/v2/networks", "");
        FileReader reader = new FileReader("src/main/java/dat/solution/file.json");
        char[] array = new char[916];
        reader.read(array);
        String json = new String(array);
        System.out.println(json);
        NetworksDTO networksDTO = gson.fromJson(json, NetworksDTO.class);
        System.out.println(gson.toJson(networksDTO));
    }
}