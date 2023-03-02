/*
 * Author Name: Mohit Saini
 * Date: 02-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.example.mongodb_test_repository.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
    private long id;

    private String name;

    private String phoneNo;

    private Product product;

}
