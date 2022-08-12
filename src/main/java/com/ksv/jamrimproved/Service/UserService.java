package com.ksv.jamrimproved.Service;

import com.ksv.jamrimproved.Models.User;
import com.ksv.jamrimproved.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUser(String userName) {
        return userRepo.getUserByUsername(userName);
    }
}
