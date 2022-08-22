package com.ksv.jamrimproved.Service;

import com.ksv.jamrimproved.Models.Comment;
import com.ksv.jamrimproved.Repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CommentService {
    @Autowired
    private CommentRepo repo;

    public List<Comment> getComments(UUID postId) {
        return repo.getComments(postId);
    }

    public Comment doComment(Comment comment, UUID postId) {
        return repo.save(comment, postId);
    }

    public void deleteComment(UUID commentId) {
        repo.deleteById(commentId);
    }
}
