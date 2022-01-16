package data;

import utils.PropertyUtils;

import java.util.Properties;

public class BoardData {
  private final Properties properties;
  private static BoardData dataLoader;

  private BoardData() {
    properties = PropertyUtils.propertyLoader("src/test/resources/data/board.properties");
  }

  public static BoardData getInstance() {
    if (dataLoader == null) {
      dataLoader = new BoardData();
    }
    return dataLoader;
  }

  public String getName(){
    String prop = properties.getProperty("name");
    if (prop != null) return prop;
    else throw new RuntimeException("Property name is not specified in the properties file");
  }
}
