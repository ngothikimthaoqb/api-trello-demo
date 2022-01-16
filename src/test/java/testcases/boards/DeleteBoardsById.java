package testcases.boards;

import api.ApiPaths.BoardApiPaths;
import commons.RestResource;
import org.testng.annotations.Test;

public class DeleteBoardsById {
  @Test
  public void deleteBoardsById(){
    RestResource.delete(BoardApiPaths.DELETE_BOARDS_BY_ID);
  }
}
