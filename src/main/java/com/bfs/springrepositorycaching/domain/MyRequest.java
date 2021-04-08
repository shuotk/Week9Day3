package com.bfs.springrepositorycaching.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyRequest {

    private String firstName;
    private String lastName;
    private String middleName;
}
