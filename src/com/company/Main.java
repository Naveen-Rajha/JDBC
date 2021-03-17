package com.company;
import org.json.*;

public class Main {

    public static void main(String[] args) {

        String xml ="<?xml version=\"1.0\" ?><root><test       attribute=\"text1\">javatpoint</test><test attribute=\"text2\">JTP</test></root>";
        try {
            JSONObject obj = XML.toJSONObject(xml);
            String s = obj.toString(1);
            System.out.println(s);
            s = "{'name':'JSON','integer':1,'double':2.0,'boolean':true,'nested':{'id':42},'array':[1,2,3]}";
            JSONObject obj2 = new JSONObject(s);
            xml = XML.toString(obj2);
            System.out.println(xml);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
