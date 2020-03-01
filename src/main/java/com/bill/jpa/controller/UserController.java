package com.bill.jpa.controller;


import com.bill.jpa.entity.User;
import com.bill.jpa.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserRespository userRespository;

    @GetMapping("/getUser/{id}")
    public User getOne(@PathVariable("id") Integer id){
        User user=userRespository.findById(id).orElse(null);
        return user;
    }

    @GetMapping("/addUser")
    public User addUser(User user){
        User save=userRespository.save(user);
        return save;
    }


}
