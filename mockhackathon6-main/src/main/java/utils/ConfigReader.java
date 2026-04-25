package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        try {
            InputStream input = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            properties = new Properties();
            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config file");
        }
    }

    public static String getBrowser() {
        return properties.getProperty("browser");
    }

    public static String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public static int getTimeout() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }
}