package org.java.personal.project.repository;

import org.java.personal.project.entity.ClientDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDetailRepository extends MongoRepository<ClientDetail, String> {
}
