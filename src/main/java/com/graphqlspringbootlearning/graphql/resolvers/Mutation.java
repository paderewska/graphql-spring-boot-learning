package com.graphqlspringbootlearning.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqlspringbootlearning.graphql.entities.Friend;
import com.graphqlspringbootlearning.graphql.enums.City;
import com.graphqlspringbootlearning.graphql.repository.FriendRepository;

public class Mutation implements GraphQLMutationResolver {

    private FriendRepository friendRepository;

    public Mutation(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

//    public Friend newFriend(City type, String name, int age) {
//        Friend friend = new Friend();
////        friend.setType(type);
//        friend.setName(name);
//        friend.setAge(age);
//
//        friendRepository.save(friend);
//
//        return friend;
//    }

//    public boolean deleteFriend(long id) {
//        friendRepository.delete(id);
//        return true;
//    }
}
