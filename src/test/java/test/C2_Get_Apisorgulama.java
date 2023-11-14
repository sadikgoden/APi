package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C2_Get_Apisorgulama {
    /*
    https://restful-booker.herokuapp.com/booking/83 url'ine bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK olduğunu Assert ediniz

 */
    @Test
    public void getAssert(){
        // URl belirleyip o adrese gidilecek
        String url = "https://restful-booker.herokuapp.com/booking/165";
        //2- exepted data verilmişse excepted data hazırlanır
        // 3- actual data alınacak
        Response response = given().when().get(url);
        response.then().assertThat()
                .statusCode(200)
                .header("Server","Cowboy")
                .contentType("application/json")
                .statusLine("HTTP/1.1 200 OK");

    }
}
