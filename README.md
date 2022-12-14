# JSON demo with API calls

## Exercise 1: JSON from text 
Create a JSON string with the following data:

- Svend Hansen, Ahlgade 45, 4300 Holbæk, Tlf: 53433434
- Ole Carlsen, Østerbrogade 23, 2100 Kbh Ø, Tlf: 21323223

## Exercise 2: DTO from JSON part I:
1. Create a DTO from the JSON above to hold one person (call it PersonDTO)
2. Create a DTO called PersonsDTO that can hold a list of PersonDTOs.
3. Use GSON to convert your JSON string to real Java objects

NB! You can find the [JSON syntax here](https://www.json.org/json-en.html)

## Exercise 3: DTO from the JSON part II:
1. Create a DTO from the JSON snippet below:

We have received some weatherdata in JSON format as given below:
````json
{
  "CurrentData": {
    "temperature": 18,
    "humidity": 60,
    "skyText": "Overvejende solrig",
    "windText": "26 m/s Sydøst"
  },
  "LocationName": "Roskilde, Sjælland"
}
````
Hint! Create a DTO called WeatherDTO in Java that can hold the data.
The WeatherDTO will have a CurrentDataDTO object as an attribute.
2. Use Gson to convert the JSON snippet to your DTO.

## Exercise 4: Run test-api calls
We will use this [User fake API](https://dummyapi.io/) in this exercise.

1. Navigate to the page and sign up with your GitHub account and get an API key.
2. Check in resources folder and open the `users.http` file. Insert your api key and run the tests.
3. Insert yourself as a user and check that it went well.
4. Update your info in some way.
5. Pay attention to the http-headers.

## Exercise 5: Run more test-api calls
We will use this [Weather API](https://vejr.eu/pages/api-documentation) in this exercise. Check the documentation.

1. Try to find the weather in `Ringsted` by entering the correct api-url in your browser.
2. Open the `weather.http` file in the `resources` folder.
3. Run the api call there.

## Exercise 6: Fetch API data in Java

1. Check the Main class and run the main methods. Notice what is happening, and how the fetched JSON string is converted to a DTO.

## API links

- [Weather](https://vejr.eu/pages/api-documentation)
- [User fake API](https://dummyapi.io/). Sign up with GitHub and get API key

## Nice links when you get an experienced DTO builder 

- [JSON to Java converter](https://instantwebtools.net/json-to-java)
- [Another JSON to Java converter](https://jsonformatter.org/json-to-java)

## Snippets

### GSON

````java
// Gson instantiation with pretty printing
private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
````

````xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.6</version>
    </dependency>
</dependencies>
````


