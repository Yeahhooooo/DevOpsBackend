package com.example.vitebackend.repository;

import com.example.vitebackend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    User findByUsername(String username);

    User findByToken(String token);
}
