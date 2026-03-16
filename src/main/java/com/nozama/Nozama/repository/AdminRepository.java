package com.nozama.Nozama.repository;

import com.nozama.Nozama.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin,String> {

}
