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

    @GetMapping(value = "/restful/users")
    public List<Users> getALL() {
        return webUsersRepository.findAll();

    }

    @PostMapping(value = "/restful/post")
    public List<Users> Persist(@RequestBody final Users users) {
        webUsersRepository.save(users);
         return webUsersRepository.findAll();

    }

}
