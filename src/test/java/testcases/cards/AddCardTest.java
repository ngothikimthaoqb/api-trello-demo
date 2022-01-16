package testcases.cards;

import api.ApiPaths.CardApiPath;
import commons.RestResource;
import data.CardData;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
public class AddCardTest {
  @Test
  public void addCard(){
    RestResource.post1(CardApiPath.ADD_CARDS, cardInfor(CardData.getInstance().getIdList(), CardData.getInstance().getName()));
  }

  static Map cardInfor (String idList, String name) {
    Map<String, String> cardInfor = new HashMap<String, String>();
    cardInfor.put("idList", idList);
    cardInfor.put("name", name);
    return cardInfor;
  }

  static Map boardInfor (String name) {
    Map<String, String> boardInfor = new HashMap<String, String>();
    boardInfor.put("name", name);
    return boardInfor;
  }
  A(list attribute: key, value){
    loop(attribute)
    return Map
  }
}
