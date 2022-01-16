package commons;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.ConfigLoader;

import java.util.HashMap;
import java.util.Map;

import static commons.RootPath.BASE_PATH;

class Builder {

  static RequestSpecification getRequestSpec() {
    Map authenInfor = setAuthen();
    return new RequestSpecBuilder()
      .setBaseUri(ConfigLoader.getInstance().getBaseUri())
      .setBasePath(BASE_PATH)
      .addQueryParams(authenInfor)
      .setAccept(ContentType.JSON)
      .setContentType(ContentType.JSON)
      .log(LogDetail.ALL)
      .build();
  }

  static ResponseSpecification getResponseSpec() {
    return new ResponseSpecBuilder().
      expectContentType(ContentType.JSON).
      log(LogDetail.ALL).
      build();
  }

  static Map setAuthen() {
    Map<String, String> authenInfor = new HashMap<String, String>();
    authenInfor.put("token",ConfigLoader.getInstance().getToken());
    authenInfor.put("key",ConfigLoader.getInstance().getKey());
    return authenInfor;
  }
}
