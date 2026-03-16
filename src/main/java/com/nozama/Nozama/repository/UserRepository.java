package com.nozama.Nozama.repository;

import com.nozama.Nozama.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
