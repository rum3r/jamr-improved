package com.ksv.jamrimproved.Service;

import com.ksv.jamrimproved.Models.Post;
import com.ksv.jamrimproved.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.UUID;

public class PostService {
    @Autowired
    private PostRepo repo;

    public Post addPost(Post post) {
        return repo.save(post);
    }

    public void deletePost(UUID postId) {
        Optional<Post> post = repo.findById(postId);
        post.ifPresent(value -> repo.delete(value));
    }
}
