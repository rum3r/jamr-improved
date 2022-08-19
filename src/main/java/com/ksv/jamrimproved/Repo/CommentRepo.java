package com.ksv.jamrimproved.Repo;

import com.ksv.jamrimproved.Models.Comment;
import com.ksv.jamrimproved.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CommentRepo extends JpaRepository<Post, UUID> {
    List<Comment> getComments();
}
