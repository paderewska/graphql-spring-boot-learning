package com.graphqlspringbootlearning.graphql.entities;

import com.graphqlspringbootlearning.graphql.enums.City;
import lombok.Data;

@Data
public class Friend {

    private long id;
    private City type;
    private String name;
    private int age;
}
