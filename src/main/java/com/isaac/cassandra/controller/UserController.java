package com.isaac.cassandra.controller;

import com.isaac.cassandra.model.User;
import com.isaac.cassandra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by isaac on 2017/02/10.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void index(@RequestBody User user) {
        //user.setId(1);
        user.setName("Isaac");
        user.setSurname("Mulaudzi");
        userService.createUser(user);
//        return "Hello World";
    }
}
