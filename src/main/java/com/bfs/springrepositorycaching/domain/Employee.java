package com.bfs.springrepositorycaching.domain;

import com.querydsl.core.annotations.QueryEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@QueryEntity
@Document
public class Employee {

    @Id
    @ApiModelProperty(notes = "EmployeeID")
    private String employeeID;
    @ApiModelProperty(notes = "First name", required = true)
    private String firstName;
    @ApiModelProperty(notes = "Last name")
    private String lastName;
    @ApiModelProperty(notes = "Middle name")
    private String middleName;
}
