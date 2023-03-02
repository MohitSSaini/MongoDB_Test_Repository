/*
 * Author Name: Mohit Saini
 * Date: 02-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.example.mongodb_test_repository.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Customer {
    @Id
    private long id;

    private String name;

    private String phoneNo;

    private Product product;

    public Customer(long id, String name, String phoneNo, Product product) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.product = product;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(phoneNo, customer.phoneNo) && Objects.equals(product, customer.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phoneNo, product);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", product=" + product +
                '}';
    }
}
