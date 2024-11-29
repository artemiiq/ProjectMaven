package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        String name = "Artem";
        String lastName = "Kryvenko";

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("lastName", lastName);

        Gson gson = new Gson();
        String jsonString = gson.toJson(jsonObject);

        System.out.println(jsonString);
    }
}