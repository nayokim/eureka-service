package com.aurora.user.UserServiceApplication.repositories;

import com.aurora.user.UserServiceApplication.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Repositories: data persist and retrieval to/from database
public interface UserRepository extends JpaRepository<UserDetails, Long> {
    @Query("Select ud FROM UserDetails ud WHERE ud.name=?1")
    List<UserDetails> findUserByName(String name);
}
