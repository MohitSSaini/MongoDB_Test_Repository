/*
 * Author Name: Mohit Saini
 * Date: 02-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.example.mongodb_test_repository.repository;

import com.example.mongodb_test_repository.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {
    @Query("{'product.name': ?0}")
    Optional<Customer> findByProductName(String name);
}
