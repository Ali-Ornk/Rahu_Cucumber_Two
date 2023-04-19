package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_Reading_Util {
    private static   Properties property = new Properties();
    static {//will get execute before everything
        String Path ="cucumber.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(Path);
            property.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("Properties File is not found!!!");
        }


    }
    public static String getProperties(String keyword){

        return property.getProperty(keyword);

    }
}