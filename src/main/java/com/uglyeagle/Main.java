package com.uglyeagle;

import static org.fusesource.jansi.Ansi.ansi;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        
        JSONObject json = new JSONObject();
        json.put("message", "main method executed successfully").
                put("status", "OK");
        System.out.println(ansi().fgGreen().a("\n" + json.toString(4) + "\n").reset());

        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            Properties prop = new Properties();
            prop.load(input);

            String propertyValue = prop.getProperty("exitMessage");
            System.out.println(ansi().fgYellow().a("Property Value: " + propertyValue).reset());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
