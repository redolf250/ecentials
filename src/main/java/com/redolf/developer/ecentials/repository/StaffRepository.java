package com.redolf.developer.ecentials.repository;

import com.redolf.developer.ecentials.model.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface StaffRepository extends MongoRepository<Staff,BigInteger> {

    Optional<Staff> findById(String staffId);
}
