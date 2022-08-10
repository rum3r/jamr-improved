package com.ksv.jamrimproved.Controller;

import com.ksv.jamrimproved.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("/test")
    public String test() { return "working"; }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {

    }
}
