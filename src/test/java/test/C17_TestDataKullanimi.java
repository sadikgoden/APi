package test;

import baseUrl.jsonPlaceBaseUrl;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class C17_TestDataKullanimi extends jsonPlaceBaseUrl {
     /*

https://jsonplaceholder.typicode.com/posts/22 url'ine bir GET
request yolladigimizda donen response'in status kodunun 200 ve
response body'sinin asagida verilen ile ayni oldugunu test ediniz

 Response body = Expected Body
  {
  "userId":3,
  "id":22,
  "title":"dolor sint quo a velit explicabo quia nam",
  "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear
  um mollitia molestiae aut atque rem suscipit\nnam impedit esse"
  }
   */
    @Test
    public void get01(){
        specJsonPlace.pathParams("pp1","posts","pp2",22);
    }

}
/*
 @Test
    public JSONObject Get01(){
        JSONObject expBody= new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear um mollitia molestiae aut atque rem suscipit\nnam impedit esse");

    return expBody;

    }
 */