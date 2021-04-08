package com.bfs.springrepositorycaching.controller;

import com.bfs.springrepositorycaching.domain.Employee;
import com.bfs.springrepositorycaching.domain.MyRequest;
import com.bfs.springrepositorycaching.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class MyController {

    @Autowired
    EmployeeRepository employeeRepository;

//    @PostMapping("byFirstName")
//    @ApiOperation(value = "Find Customer by First Name",response = Employee.class)
//    public Employee getCustomerByFirstName(@RequestBody MyRequest request) {
//        return employeeRepository.findByFirstName(request.getFirstName()).orElse(null);
//    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(Employee.builder().firstName(employee.getFirstName())
                .lastName(employee.getLastName()).middleName(employee.getMiddleName()).build());
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
