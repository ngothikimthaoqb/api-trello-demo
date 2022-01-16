package utils;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
        properties = PropertyUtils.propertyLoader("src/test/resources/config.properties");
    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }

        return configLoader;
    }

    public String getBaseUri() {
        String prop = properties.getProperty("baseUri");
        if (prop != null) return prop;
        else throw new RuntimeException("Property baseUri is not specified in the properties file");
    }

    public String getKey() {
        String prop = properties.getProperty("key");
        if (prop != null) return prop;
        else throw new RuntimeException("Property key is not specified in the properties file");
    }

    public String getToken() {
        String prop = properties.getProperty("token");
        if (prop != null) return prop;
        else throw new RuntimeException("Property token is not specified in the properties file");
    }
}
