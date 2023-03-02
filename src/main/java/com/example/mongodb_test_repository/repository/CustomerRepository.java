/*
 * Author Name: Mohit Saini
 * Date: 02-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.example.mongodb_test_repository.repository;

import com.example.mongodb_test_repository.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, Long> {

    Optional<Customer> findByName(String name);
}
