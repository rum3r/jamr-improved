package com.ksv.jamrimproved.Service;

import com.ksv.jamrimproved.Models.Comment;
import com.ksv.jamrimproved.Repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepo repo;

    public List<Comment> getComments() {
        return repo.getComments();
    }
}
