package com.deepak.springbootapimongodb.repository;

import com.deepak.springbootapimongodb.model.NACEDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NACEDetailRepository extends MongoRepository<NACEDetail, String> {
}
