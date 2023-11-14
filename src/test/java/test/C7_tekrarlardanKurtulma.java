package test;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class C7_tekrarlardanKurtulma {
    @Test
    public void tekrarlardankurtulma(){
        /*
https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request gonderdigimizde donen Response'un,
        status code'unun 200,
        ve content type'inin application/json, ve response body'sindeki
        "firstname"in, "Susan",
        ve "lastname"in, "Jackson",
        ve "totalprice"in, 612,
        ve "depositpaid"in, false,
     ve "additionalneeds"in, "Breakfast" oldugunu test edin
 */
        // 1- EndPoint hazırlama
        String url ="https://restful-booker.herokuapp.com/booking/10";
        //2- expected body verilmediği için sorgulama yapılmadı
        //3- Responde kaydedilir
        Response response = given().when().get(url);

        //4- Assertion yap
        response.then().assertThat().statusCode(200).
                contentType("application/json").body("firstname",equalTo("Jim"),
                        "lastname",equalTo("Jones"),
                        "totalprice",equalTo(195),
                        "depositpaid",equalTo(false),
                        "additionalneeds",equalTo("Breakfast")
                );


    }
}
/*

 "firstname": "Jim",
    "lastname": "Wilson",
    "totalprice": 662,


 */