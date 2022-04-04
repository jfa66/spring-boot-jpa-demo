package com.example.jpa.dao;

import com.example.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author jiangfengan
 */
public interface UserRepository extends JpaRepository<User,String> {

    @Query("from User where username=:username")
    User findByName(@Param("username") String username);
}
