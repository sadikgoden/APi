package test;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class C8_JSonArrayKullanımı {
    @Test
    public <JSonArray> void JSonArray(){

        /*
{
"firstName": "John",
"lastName": "doe",
"age": 26,
"address": {
    "streetAddress": "naist street",
    "city": "Nara",
    "postalCode": "630-0192"
            },
"phoneNumbers": [
                {
                    "type": "iPhone",
                    "number": "0123-4567-8888"
                },
                {
                    "type": "home",
                    "number": "0123-4567-8910"
                }
                ]
}
 */
        // String url ="";
        JSONObject ceptel=new JSONObject();
        ceptel.put( "type", "iPhone");
        ceptel.put( "number", "0123-4567-8888");

        JSONObject evtel= new JSONObject();
        evtel.put("type", "home");
        evtel.put( "number","0123-4567-8910");

        JSONArray phoneNumbers=new JSONArray();
        phoneNumbers.put(0,ceptel);
        phoneNumbers.put(1,evtel);

        JSONObject adres = new JSONObject();
        adres.put( "streetAddress","naist street");
        adres.put("city", "Nara");
        adres.put("postalCode", "630-0192");

        JSONObject personelinfo= new JSONObject();
        personelinfo.put("firstName","John");
        personelinfo.put("lastName", "doe");
        personelinfo.put("age", 26);
        personelinfo.put("address",adres);
        personelinfo.put("phoneNumbers",phoneNumbers);

        System.out.println("personel info =  "+personelinfo);
        System.out.println("Kişi adı =  "+personelinfo.get("firstName"));
        System.out.println("Kişi soyadı =  "+personelinfo.get("lastName"));
        System.out.println("Kişi yaşı =  "+personelinfo.get("age"));
        System.out.println("Kişi adresi - sokak =  "+personelinfo.getJSONObject("address").get("streetAddress"));
        System.out.println("Kişi adresi - şehir =  "+personelinfo.getJSONObject("address").get("city"));
        System.out.println("Kişi adresi - postakodu =  "+personelinfo.getJSONObject("address").get("postalCode"));

        System.out.println("Kişi telefon1 tür =  "+personelinfo.getJSONArray("phoneNumbers").getJSONObject(0).get("type"));
        System.out.println("Kişi telefon1 Number=  "+personelinfo.getJSONArray("phoneNumbers").getJSONObject(0).get("number"));
        System.out.println("Kişi telefon 2 tür =  "+personelinfo.getJSONArray("phoneNumbers").getJSONObject(1).get("type"));
        System.out.println("Kişi telefon1 number =  "+personelinfo.getJSONArray("phoneNumbers").getJSONObject(1).get("number"));



    }
}
