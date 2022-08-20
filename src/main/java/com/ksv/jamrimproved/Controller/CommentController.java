package com.ksv.jamrimproved.Controller;

import com.ksv.jamrimproved.Models.Comment;
import com.ksv.jamrimproved.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/getComments/{postId}")
    public List<Comment> getComments(@PathVariable UUID postId) {
        return commentService.getComments();
    }

    @PostMapping("/doComment/{postId}")
    public Comment doComment(@PathVariable UUID postId) {
        return commentService.doComment(postId);
    }
}
