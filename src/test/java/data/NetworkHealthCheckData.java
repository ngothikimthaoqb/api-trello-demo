package data;

import utils.PropertyUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class NetworkHealthCheckData {
    private final Properties properties;
    private static NetworkHealthCheckData dataLoader;

    private NetworkHealthCheckData() {
        properties = PropertyUtils.propertyLoader("src/test/resources/data/networkHealthCheck.properties");
    }

    public static NetworkHealthCheckData getInstance() {
        if (dataLoader == null) {
            dataLoader = new NetworkHealthCheckData();
        }
        return dataLoader;
    }

    public List<String> getDomains() {
        List<String> prop = Arrays.asList(properties.getProperty("domains").split(","));
        if (prop != null) return prop;
        else throw new RuntimeException("Property domains is not specified in the properties file");
    }

    public String getPlatformName() {
        String prop = properties.getProperty("platformName");
        if (prop != null) return prop;
        else throw new RuntimeException("Property platformName is not specified in the properties file");
    }

    public String getPlatformVersion() {
        String prop = properties.getProperty("platformVersion");
        if (prop != null) return prop;
        else throw new RuntimeException("Property platformVersion is not specified in the properties file");
    }

    public String getUdid() {
        String prop = properties.getProperty("udid");
        if (prop != null) return prop;
        else throw new RuntimeException("Property udid is not specified in the properties file");
    }

    public String getTimeout() {
        String prop = properties.getProperty("timeout");
        if (prop != null) return prop;
        else throw new RuntimeException("Property timeout is not specified in the properties file");
    }

    public String getType() {
        String prop = properties.getProperty("type");
        if (prop != null) return prop;
        else throw new RuntimeException("Property type is not specified in the properties file");
    }

    public String getStatusNotConnect() {
        String prop = properties.getProperty("statusNotConnect");
        if (prop != null) return prop;
        else throw new RuntimeException("Property statusNotConnect is not specified in the properties file");
    }

    public String getUsingProxy() {
        String prop = properties.getProperty("usingProxy");
        if (prop != null) return prop;
        else throw new RuntimeException("Property usingProxy is not specified in the properties file");
    }
}
