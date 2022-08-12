package com.ksv.jamrimproved.Repo;

import com.ksv.jamrimproved.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
    @Query(value = "SELECT u FROM User u WHERE u.userName = ?1")
    User getUserByUsername(String userName);

    User updateUserByUsername(User user, String userName);
}
