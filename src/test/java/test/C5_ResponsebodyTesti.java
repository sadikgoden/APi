package test;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class C5_ResponsebodyTesti {
    @Test
    public void BodyTesti(){
        /*
        https://jsonplaceholder.typicode.com/posts/44 url'ine bir GET request yolladigimizda
 donen Response’in
  status code'unun 200,
  ve content type'inin Aplication.JSON,
  ve response body'sinde bulunan userId'nin 5,
  ve response body'sinde bulunan title'in "optio dolor molestias sit"
 oldugunu test edin.
         */
        //1- endpoint hazırlanır
        String url=" https://jsonplaceholder.typicode.com/posts/44";

        //2- expectedData hazırlanır
        //3-Dönecek response kaydet
        Response response = given().when().get(url);
        response.prettyPrint();

        //4- Assert işlemi yapılır
        response.then().assertThat().
                statusCode(200).contentType("application/json; charset=utf-8")
                .body("userId", equalTo(5)).
                body("title",equalTo("optio dolor molestias sit"));



    }
}
