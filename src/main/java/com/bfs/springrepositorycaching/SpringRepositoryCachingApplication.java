package com.bfs.springrepositorycaching;

import com.bfs.springrepositorycaching.domain.QCustomer;

import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class SpringRepositoryCachingApplication /*implements CommandLineRunner*/ {

//    @Autowired
//    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringRepositoryCachingApplication.class, args);
    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        repository.deleteAll();
//
//        // save a couple of customers
//        repository.save(Customer.builder().firstName("Alice").lastName("Smith").build());
//        repository.save(Customer.builder().firstName("Bob").lastName("Smith").build());
//
//        // fetch all customers
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (Customer customer : repository.findAll()) {
//            System.out.println(customer);
//        }
//        System.out.println();
//
//        // fetch an individual customer
//        System.out.println("Customer found with findByFirstName('Alice'):");
//        System.out.println("--------------------------------");
//        System.out.println(repository.findByFirstName("Alice").orElse(null));
//
//        System.out.println("Customers found with findByLastName('Smith'):");
//        System.out.println("--------------------------------");
//        for (Customer customer : repository.findByLastName("Smith")) {
//            System.out.println(customer);
//        }
//
//        System.out.println("Customers found with searchCustomerByLastName('Smith'):");
//        System.out.println("--------------------------------");
//        for (Customer customer : repository.searchCustomerByLastName("Smith")) {
//            System.out.println(customer);
//        }
//
//        System.out.println("Customers found with customized query:");
//        System.out.println("--------------------------------");
//        QCustomer qCustomer = new QCustomer("customer");
//        Predicate predicate = qCustomer.firstName.startsWith("A");
//        for (Customer customer : repository.findAll(predicate)) {
//            System.out.println(customer);
//        }
//
//    }
}
