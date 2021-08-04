/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.Math;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Path path = Paths.get("app/src/main/resources/recentquotes.json");
        Gson gson = new Gson();
        StringBuilder jsonString = new StringBuilder();
        Quote[] listOfObjects = gson.fromJson(jsonString.toString(), Quote[].class);

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line = reader.readLine();
            jsonString.append(line);

            while (line != null) {
                line = reader.readLine();
                jsonString.append(line);
                int min =0;
                int max =listOfObjects.length-1;
////                int ss = (max - min) + 1;
////                return (int)(Math.random() * ss) + min;
                int number = (int)(Math.random() *(max-min+1)+min );
                System.out.println(listOfObjects[number].toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(jsonString);
//
//        Quote[] quoteList =gson.fromJson(jsonString.toString(),Quote[].class);
//        System.out.println(quoteList[0]);
        System.out.println(listOfObjects[0]);
    }
}