package testcases.cards;

import api.ApiPaths.CardApiPath;
import commons.RestResource;
import org.testng.annotations.Test;

public class DeleteCardsByIdCardTest {
  @Test
  public void deleteCardsByIdCard(){
    RestResource.delete(CardApiPath.DELETE_CARDS_BY_ID);
  }
}