package com.windhc.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author HC
 */
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Book A", "zhangsan");
        Gson gson = buildGson();
        // Serialization
        String json = gson.toJson(book1);
        System.out.println("Serialization: " + json);

        // Deserialization
        String testJson = "{\"title\":\"Book A\",\"author\":\"zhangsan\"}";
        Book book2 = gson.fromJson(testJson, Book.class);
        System.out.println("Deserialization: " + book2);
    }

    private static Gson newGson() {
        return new Gson();
    }

    private static Gson buildGson() {
        return new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }
}
