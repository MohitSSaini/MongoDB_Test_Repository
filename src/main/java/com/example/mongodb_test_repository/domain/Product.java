/*
 * Author Name: Mohit Saini
 * Date: 02-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.example.mongodb_test_repository.domain;

public class Product {

    private long id;

    private String name;

    private String description;

    public Product(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Product() {
    }
}
