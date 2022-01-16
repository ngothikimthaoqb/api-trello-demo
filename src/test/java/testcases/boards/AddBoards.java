package testcases.boards;

import api.ApiPaths.BoardApiPaths;
import commons.RestResource;
import data.BoardData;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
public class AddBoards {
  @Test
  public void addBoards(){
    RestResource.post1(BoardApiPaths.ADD_BOARDS, boardInfor(BoardData.getInstance().getName() ));
  }

  static Map boardInfor (String name) {
    Map<String, String> boardInfor = new HashMap<String, String>();
    boardInfor.put("name", name);
    return boardInfor;
  }
  //Model
//  - board object
//  - Card object
//    => struct
}
