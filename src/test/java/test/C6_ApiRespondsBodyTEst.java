package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class C6_ApiRespondsBodyTEst {
    @Test
    public void bodyTesti() {
        /*
    https://jsonplaceholder.typicode.com/posts url'ine asagidaki body ile bir POST request
gonderdigimizde
            {
            "title":"API",
            "body":"API ogrenmek ne guzel",
            "userId":10,
            }
            donen Response'un,
            status code'unun 201,
            ve content type'inin application/json
            ve Response Body'sindeki, "title"'in "API" oldugunu
            "userId" degerinin 100'den kucuk oldugunu
                "body" nin "API" kelimesi icerdigini test edin.
     */
        // 1- Endpoint hazırla
        String url = "https://jsonplaceholder.typicode.com/posts";

        // 2- expected Data verilseydi bu adımda hazırlanır
        //3- Responds Kaydet
        // Response response = given().when().get(url); // get methoduyla böyle hazırlanır
        JSONObject reqBody = new JSONObject();
        reqBody.put("title", "API");
        reqBody.put("body", "API ogrenmek ne guzel");
        reqBody.put("userId", 10);
        Response response = given().contentType(ContentType.JSON)
                .when().body(reqBody.toString()).post(url);
        // 4- Assertion yap
        response.then().assertThat()
                .statusCode(201).contentType("Application/json").
                body("title",equalTo("API"),
                        "userId", lessThan(100),"body",containsString("API"));

    }
}