package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class C1_Get_ApiSorgulama {
    
    /*
C1_Get_ApiSorgulama
https://restful-booker.herokuapp.com/booking/83 url'ine bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK
ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
 */
    // Assertion işlemine tabi tut 
    @Test
    public  void get01(){
        // URl belirleyip o adrese gidilecek
        String url = "https://restful-booker.herokuapp.com/booking/83";

        //2- exepted data verilmişse excepted data hazırlanır
        // 3- actual data alınacak
        Response response = given().when().get(url);
        //response.prettyPrint();
        System.out.println("Status Code : "+response.getStatusCode());
        System.out.println("Content Type : "+response.getContentType());
        System.out.println(" Server Header Değeri : "+response.getHeader("Server"));
        System.out.println("Status Line : "+response.getStatusLine());
        System.out.println("Get Time : "+response.getTime());
        System.out.println("---------------------------------");
       // System.out.println(" Server Header Değeri : "+response.getHeaders());

    }
     
}
