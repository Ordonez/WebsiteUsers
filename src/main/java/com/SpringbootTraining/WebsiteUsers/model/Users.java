package com.SpringbootTraining.WebsiteUsers.model;

import javax.persistence.*;

@Entity
@Table(name = "users_table")  //mysql DB table name 

public class Users {

    //id will be auto generated
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private int id;
    @Column(name= "name")
    private String name;
    @Column(name= "email")
    private String email;

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users() {

    
    }
}
