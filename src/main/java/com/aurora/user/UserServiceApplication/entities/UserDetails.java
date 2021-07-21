package com.aurora.user.UserServiceApplication.entities;

import sun.util.resources.Bundles;

import javax.persistence.*;

//entities: represent the database table as objects
@Entity
@Table
public class UserDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName(String name){
        return this.name;
    }

    public void setName(){
        this.name=name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age=age;
    }





}
