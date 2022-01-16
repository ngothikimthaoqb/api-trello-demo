package testcases.boards;

import api.ApiPaths.BoardApiPaths;
import commons.RestResource;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UpdateBoardsByIdBoard {
  @Test
  public void updateBoardsByIdBoard(){
    RestResource.put(BoardApiPaths.UPDATE_BOARDS_BY_ID, boardInfor("Board board") );
  }

  static Map boardInfor (String name) {
    Map<String, String> boardInfor = new HashMap<String, String>();
    boardInfor.put("name", name);
    return boardInfor;
  }
}
