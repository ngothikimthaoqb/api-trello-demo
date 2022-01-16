package commons;

import io.restassured.response.Response;

import java.util.Map;

import static commons.Builder.getRequestSpec;
import static commons.Builder.getResponseSpec;
import static io.restassured.RestAssured.given;

public class RestResource {

  public static Response post1(String path, Map params) {
    return given(getRequestSpec())
      .queryParams(params)
      .when().post(path).
        then().spec(getResponseSpec()).
        extract().
        response();
  }

  public static Response post(String path, Object request) {
    return given(getRequestSpec())
      .body(request)
      .when().post(path).
      then().spec(getResponseSpec()).
      extract().
      response();
  }

  public static Response get(String path) {
    return given(getRequestSpec())

      .when().get(path).
      then().spec(getResponseSpec()).
      extract().
      response();
  }

  public static Response put(String path,  Map params) {
    return given(getRequestSpec())
      .queryParams(params)
      .when().put(path).
      then().spec(getResponseSpec()).
      extract().
      response();
  }

  public static Response delete(String path) {
    return given(getRequestSpec())
      .when().delete(path).
      then().spec(getResponseSpec()).
      extract().
      response();
  }
}
