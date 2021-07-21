package com.aurora.user.UserServiceApplication.services;

import com.aurora.user.UserServiceApplication.dtos.UserDetailsDTO;
import com.aurora.user.UserServiceApplication.entities.UserDetails;
import com.aurora.user.UserServiceApplication.repositories.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service: handles business logic
 */
public class UserService {
    private final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    @Transactional
    public UserDetailsDTO saveUpdate(UserDetailsDTO inputUser){
        try{
            UserDetails userDetails = new UserDetails();

        }
    }
}
