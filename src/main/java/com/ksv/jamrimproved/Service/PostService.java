package com.ksv.jamrimproved.Service;

import com.ksv.jamrimproved.Models.Post;
import com.ksv.jamrimproved.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class PostService {
    @Autowired
    private PostRepo repo;

    public Post addPost(Post post) {
        return repo.save(post);
    }
}
