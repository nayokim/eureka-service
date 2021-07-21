package com.aurora.user.UserServiceApplication.services;

import com.aurora.user.UserServiceApplication.dtos.UserDetailsDTO;
import com.aurora.user.UserServiceApplication.entities.UserDetails;
import com.aurora.user.UserServiceApplication.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service: handles business logic
 */
public class UserService {
    private final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    /**
     * save the user and return the saved user details
     * @param inputUser
     * @return
     */
    @Transactional
    public UserDetailsDTO saveUpdate(UserDetailsDTO inputUser){
        try{
            UserDetails userDetails = new UserDetails();
            userDetails.setName(inputUser.getName());
            userDetails.setAge(Integer.parseInt(inputUser.getAge()));
            return getUserDetailsDTO(repository.save(userDetails));
        }catch (Exception e){
            LOGGER.warn("exception in userService -> saveUpdate()" + e);
        }
        return null;
    }

    /**
     * get user details based on id
     * @param id
     * @return
     */
    public UserDetailsDTO getById(Long id){
        return getUserDetailsDTO(repository.getOne(id));
    }

    /**
     * Returns the user detials list based on name
     * @param name
     * @return
     */

    public List<UserDetailsDTO> getByName(String name){
        List<UserDetails> userDetailsList = repository.findUserByName(name);
        if(CollectionUtils.isEmpty(userDetailsList)){
            return null;
        }
        return userDetailsList.stream().map(this::getUserDetailsDTO).collect(Collectors.toList());
    }

    /**
     *
     * @param userDetails
     * @return
     */

    public UserDetailsDTO getUserDetailsDTO(UserDetails userDetails){
        return new UserDetailsDTO(
                userDetails.getId().toString(),
                userDetails.getName(),
                userDetails.getAge().toString()
        );
    }
}
