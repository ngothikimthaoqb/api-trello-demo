package data;

import utils.PropertyUtils;

import java.util.Properties;

public class CardData {
  private final Properties properties;
  private static CardData dataLoader;

  private CardData() {
    properties = PropertyUtils.propertyLoader("src/test/resources/data/card.properties");
  }

  public static CardData getInstance() {
    if (dataLoader == null) {
      dataLoader = new CardData();
    }
    return dataLoader;
  }

  public String getIdList(){
    String prop = properties.getProperty("idList");
    if (prop != null) return prop;
    else throw new RuntimeException("Property idList is not specified in the properties file");
  }

  public String getName(){
    String prop = properties.getProperty("name");
    if (prop != null) return prop;
    else throw new RuntimeException("Property name is not specified in the properties file");
  }
}
