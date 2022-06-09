package com.redolf.developer.ecentials.staff;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface StaffRepository extends MongoRepository<Staff, BigInteger> {
}
