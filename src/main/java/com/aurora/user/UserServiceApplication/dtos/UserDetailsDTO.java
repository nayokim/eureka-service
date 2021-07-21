package com.aurora.user.UserServiceApplication.dtos;

import com.aurora.user.UserServiceApplication.entities.UserDetails;

/**
 * Dtos - the representation of the entity or set of entities
 * DTO does not have any behaviour except for storage and retrieval of its own data (accessors and mutators)
 */
public class UserDetailsDTO {
    private String id;
    private String name;
    private String age;

    public UserDetailsDTO(String id, String name, String age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAge(){
        return this.age;
    }

    public void setAge(String age){
        this.age=age;
    }


}
