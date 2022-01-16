package testcases.cards;

import api.ApiPaths.CardApiPath;
import commons.RestResource;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UpdateCardsByIdCardTest {
  @Test
  public void updateCardsByIdCard(){
    RestResource.put(CardApiPath.UPDATE_CARDS_BY_ID, cardInfor("613336874008dc67146133c8", "Card update") );
  }

  static Map cardInfor (String idList, String name) {
    Map<String, String> cardInfor = new HashMap<String, String>();
    cardInfor.put("idList", idList);
    cardInfor.put("name", name);
    return cardInfor;
  }
}
