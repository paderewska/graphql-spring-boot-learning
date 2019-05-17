package com.graphqlspringbootlearning.graphql.entities;

import com.graphqlspringbootlearning.graphql.enums.City;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Friend {

    @Id
    @Column(name="friend_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @Column(name="friend_city")
//    private City type;

    @Column(name="friend_city", nullable = false)
    private String name;

    @Column(name="friend_age", nullable = false)
    private int age;
}
