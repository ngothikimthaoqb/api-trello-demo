package commons


import io.restassured.builder.RequestSpecBuilder
import io.restassured.builder.ResponseSpecBuilder
import io.restassured.filter.log.LogDetail
import io.restassured.http.ContentType
import io.restassured.specification.RequestSpecification
import io.restassured.specification.ResponseSpecification
import utils.ConfigLoader


import static commons.RootPath.BASE_PATH

class SpecBuilder {

  static RequestSpecification getRequestSpec() {

    return new RequestSpecBuilder()
      .setBaseUri(ConfigLoader.getInstance().getBaseUri())
      .setBasePath(BASE_PATH)
//      .addParam("key", ConfigLoader.getInstance().getKey())
//      .addParam("token",  ConfigLoader.getInstance().getToken())
//
//      .addQueryParam( "token",  ConfigLoader.getInstance().getToken())
//      .addQueryParam("key", ConfigLoader.getInstance().getKey())
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

}
