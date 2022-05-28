package com.microservicecamp.os.api.repository;

import com.microservicecamp.os.api.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository <Order,Integer> {
}
