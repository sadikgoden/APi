package test;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class C4_JSonDataOlustur {
/*
Asagidaki JSON Objesini olusturup konsolda yazdirin.
{
    "title":"Ahmet",
    "body":"Merhaba",
    "userId":1
}
 */
    @Test
    public void JSonData(){
        JSONObject jsonData =new JSONObject();
        jsonData.put("title","Ahmet");
        jsonData.put("body","Merhaba");
        jsonData.put("userid",1);
        System.out.println("ilk oluşturduğum =  "+jsonData);

    }

    @Test
    public  void innerJson(){
        /*
Asagidaki JSON Objesini olusturup konsolda yazdirin.

{
"firstname":"Jim",
 "additionalneeds":"Breakfast",
 "bookingdates":{
                "checkin":"2018-01-01",
                "checkout":"2019-01-01"
                },
"totalprice":111,
"depositpaid":true,
 "lastname":"Brown"
}
 */
        JSONObject innerJson = new JSONObject();
        innerJson.put("checkin","2018-01-01");
        innerJson.put("checkout","2019-01-01");

        JSONObject jsondata = new JSONObject();
        jsondata.put("firstname","Jim");
        jsondata.put("additionalneeds","Breakfast");
        jsondata.put("bookingdates",innerJson);
        jsondata.put("totalprice",111);
        jsondata.put("depositpaid",true);
        jsondata.put("lastname","Brown");
        System.out.println("Json methodu  =  " +jsondata);

    }
}
