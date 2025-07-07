package se.linda.Anima_Ki;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public interface Constants {
    Properties prop = new Properties();

    private static void getProperties() {
        try {
            File temp = new File("src/main/resources/application.properties");
            prop.load(new FileInputStream(temp));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getConnection() {
        getProperties();
        return prop.getProperty("db.connection");
    }

    private static String getLogin(){
        getProperties();
        return prop.getProperty("db.login");
    }

    String connection = getConnection();
    String login = getLogin();
}