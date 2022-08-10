package com.ksv.jamrimproved.Service;

import com.ksv.jamrimproved.Models.User;
import com.ksv.jamrimproved.Repo.UserRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepoImpl userRepo;
    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }
}
