package org.example;

import com.google.gson.Gson;

public class MyNameGenerator {
    public static void main(String[] args) {
        String name = "Serhiy";
        String lastName = "Shyian";

        NameInfo nameInfo = new NameInfo(name, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(nameInfo);

        System.out.println(json);
    }
}