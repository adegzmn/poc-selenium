package POC;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;

public class JsonPuller {

    public static void main(String[] args) throws Exception {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        String filePath = "creds.json"; // Replace with the path to your JSON file

        try (FileReader reader = new FileReader("creds.json"))
        {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            JSONObject jsonObject = new JSONObject(content);

            String name = jsonObject.getString("name");
            Object age = jsonObject.getInt("age");

            JSONObject address = jsonObject.getJSONObject("address");
            String city = address.getString("city");
            String country = address.getString("country");

            JSONArray hobbies = jsonObject.getJSONArray("hobbies");
            for (int i = 0; i < hobbies.length(); i++) {
                System.out.println("Hobby: " + hobbies.getString(i));
            }

            JSONObject thingy = jsonObject.getJSONObject("qa");
            String nameQA = thingy.getString("name");

            System.out.println(nameQA);

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("Country: " + country);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static String readFileAsString(String file) throws Exception {
//        return new String(Files.readAllBytes(Paths.get(file)));
//    }


}
