package com.sin.xyzbank.core;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

/* This is a utility class to read properties from config.properties */

public class ConfigReader {
    private static Properties properties;

    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration file");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
