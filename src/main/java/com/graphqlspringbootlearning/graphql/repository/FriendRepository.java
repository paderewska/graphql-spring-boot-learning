package com.graphqlspringbootlearning.graphql.repository;

import com.graphqlspringbootlearning.graphql.entities.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendRepository extends CrudRepository<Friend, Long> {
//    void delete(Long id);
}
