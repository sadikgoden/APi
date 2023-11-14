package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class C3_PUTResponseAssert {
    @Test
    public void PutMethodu(){

        /*
https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki Json formatindaki body ile
    bir PUT request gonderdigimizde
    {
    "title": "Ahmet",
    "body": "Merhaba",
    "userId": 10,
    "id": 70
    }
    donen Response'un,
    status code'unun 200,
    ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin cloudflare,
    ve status Line'in HTTP/1.1 200 OK
 */
        String url ="https://jsonplaceholder.typicode.com/posts/70";
        JSONObject reqbody = new JSONObject();
        reqbody.put( "title", "Ahmet");
        reqbody.put( "body","Merhaba");
        reqbody.put( "userId", 10);
        reqbody.put("id", 70);
        Response response =given().  contentType(ContentType.JSON)
                           .when() .body(reqbody.toString()).put(url);
        response.then().assertThat()
                .statusCode(200).header("Server","cloudflare").
                statusLine("HTTP/1.1 200 OK");
    }
}
