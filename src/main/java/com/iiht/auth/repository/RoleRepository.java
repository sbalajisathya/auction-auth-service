package com.iiht.auth.repository;

import java.util.Optional;

import com.iiht.auth.models.ERole;
import com.iiht.auth.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
