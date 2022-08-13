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

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public User updateUserByUsername(User user) {
        return userRepo.updateUserByUsername(user, user.getUserName());
    }

    public User deleteUserByUsername(String userName) {
        return userRepo.deleteUserByUsername(userName);
    }
}
