package org.java.personal.project.repository;

import org.java.personal.project.entity.DummyUser;
import org.java.personal.project.entity.DummyUserRole;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<DummyUser, String> {

    DummyUser findDummyUserByUsername(String username);

    List<DummyUser> findAllByDummyUserRole(DummyUserRole dummyUserRole);

    Optional<DummyUser> findByUsername(String username);

    Optional<DummyUser> findByEmail(String email);

}
