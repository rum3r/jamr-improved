package com.ksv.jamrimproved.Controller;

import com.ksv.jamrimproved.Models.User;
import com.ksv.jamrimproved.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/test")
    public String test() { return "working"; }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/getUser/{userName}")
    public User getUser(@PathVariable String userName) {
        return userService.getUser(userName);
    }
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    @PutMapping("/updateUserByUsername")
    public User updateUserByUsername(@RequestBody User user) {
        return userService.updateUserByUsername(user);
    }
}
