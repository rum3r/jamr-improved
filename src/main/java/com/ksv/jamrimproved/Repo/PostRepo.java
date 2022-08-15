package com.ksv.jamrimproved.Repo;

import com.ksv.jamrimproved.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostRepo  extends JpaRepository<Post, UUID> {
}
