package com.aurora.user.UserServiceApplication.controllers;

import com.aurora.user.UserServiceApplication.dtos.UserDetailsDTO;
import com.aurora.user.UserServiceApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controllers: expose the API end points for CRUD operations
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value="/saveUpdate")
    public UserDetailsDTO saveUpdate(@RequestBody UserDetailsDTO inputUser){
        return userService.saveUpdate(inputUser);
    }

    @GetMapping(value="/getById/{id}")
    public UserDetailsDTO getUserById(@PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping(value="/getByName/{name")
    public List<UserDetailsDTO> getUserByName(@PathVariable String name){
        return userService.getByName(name);
    }

}
