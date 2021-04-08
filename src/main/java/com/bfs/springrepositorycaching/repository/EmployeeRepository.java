package com.bfs.springrepositorycaching.repository;


import com.bfs.springrepositorycaching.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
//
//    Optional<Employee> findByFirstName(String firstName);
//    List<Employee> findByLastName(String lastName);
//
//    @Query(value = "{'lastName': ?0}", fields = "{'firstName': 1}")
//    List<Employee> searchCustomerByLastName(String lastName);
}
