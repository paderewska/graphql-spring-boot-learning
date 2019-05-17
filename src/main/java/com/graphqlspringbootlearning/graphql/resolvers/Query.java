package com.graphqlspringbootlearning.graphql.resolvers;

import com.graphqlspringbootlearning.graphql.entities.Friend;
import com.graphqlspringbootlearning.graphql.enums.City;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.ArrayList;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    public List<Friend> friends() {
        List<Friend> friends = new ArrayList<>();

        Friend friend = new Friend();
        friend.setId(1l);
        friend.setType(City.LODZ);
        friend.setName("Hubs");
        friend.setAge(31);

        friends.add(friend);

        return friends;
    }
}

