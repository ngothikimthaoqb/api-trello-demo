package testcases.boards;

import api.ApiPaths.BoardApiPaths;
import commons.RestResource;
import org.testng.annotations.Test;

public class GetBoardsByIdBoard {
  @Test
  public void getBoardsByIdCard(){
    RestResource.get(BoardApiPaths.GET_BOARDS_BY_ID_BOARD);
  }
}
