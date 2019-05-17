package com.graphqlspringbootlearning.graphql.resolvers;

import com.graphqlspringbootlearning.graphql.entities.Friend;
import com.graphqlspringbootlearning.graphql.repository.FriendRepository;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

    private FriendRepository friendRepository;

    public Query(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

    public Iterable<Friend> findAllFriends() {
        return friendRepository.findAll();
    }

    public int countFriends() {
        return (int)friendRepository.count();
    }
}

