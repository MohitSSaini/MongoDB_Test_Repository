package com.example.mongodb_test_repository.repository;

import com.example.mongodb_test_repository.domain.Customer;
import com.example.mongodb_test_repository.domain.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@DataMongoTest
class CustomerRepositoryTest {
    Customer customer;
    Product product;
    @Autowired
    CustomerRepository customerRepository;


    @BeforeEach
    void setUp() {
        product = new Product(15, "Phone", "Smart Phones");
        customer = new Customer(30, "Ravi", "9802009868", product);
    }

    @AfterEach
    void tearDown() {
        product = null;
        customer = null;
        customerRepository.deleteAll();
    }

    @Test
    @DisplayName("Test For Find By Product Name")
    void findByProductName() {
        customerRepository.save(customer);
        product = new Product(12, "Samsung", "Good");
        customer = new Customer(20, "Harish", "993884882", product);
        customerRepository.save(customer);
        Optional<Customer> customerOptional = customerRepository.findByProductName("Samsung");
        assertTrue(customerOptional.isPresent());
    }
}