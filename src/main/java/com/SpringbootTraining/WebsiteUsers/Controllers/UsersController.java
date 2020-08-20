package com.SpringbootTraining.WebsiteUsers.Controllers;

import com.SpringbootTraining.WebsiteUsers.model.Users;
import com.SpringbootTraining.WebsiteUsers.repository.WebUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

public class UsersController {

    @Autowired
    WebUsersRepository webUsersRepository;

    //Creating Get method to fetch users from database
    @GetMapping(value = "/restful/users")
    public List<Users> getALL() {
        return webUsersRepository.findAll();
    
    }

    //Creating Post method
    @PostMapping(value = "/restful/post")
    public List<Users> Persist(@RequestBody Users users) {
        webUsersRepository.save(users);
         return webUsersRepository.findAll();

    }

}
