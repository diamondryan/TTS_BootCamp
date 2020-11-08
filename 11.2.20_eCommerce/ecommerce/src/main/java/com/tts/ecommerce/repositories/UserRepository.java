package com.tts.ecommerce.repositories;

import com.tts.ecommerce.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
