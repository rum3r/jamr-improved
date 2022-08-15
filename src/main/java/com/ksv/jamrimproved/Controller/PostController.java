package com.ksv.jamrimproved.Controller;

import com.ksv.jamrimproved.Models.Post;
import com.ksv.jamrimproved.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/postAPost")
    public Post postAPost(@RequestBody Post post) {
        return postService.addPost(post);
    }
}
