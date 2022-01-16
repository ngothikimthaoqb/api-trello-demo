package testcases.cards;

import api.ApiPaths.CardApiPath;
import commons.RestResource;
import org.testng.annotations.Test;


public class GetCardsByIdCardTest {

  @Test
  public void getCardsByIdCard(){
     RestResource.get(CardApiPath.GET_CARDS_BY_ID_CARD);
  }

}
