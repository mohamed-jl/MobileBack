package com.example.backMobile.Controller;

import com.example.backMobile.Entity.Post;
import com.example.backMobile.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postRepository;

    @Autowired
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/create")
    public Post createPost(@RequestParam String text) {
        Post post = new Post();
        post.setText(text);


        post.setDate(new Date().toString());


        post.setUserName("anonymous");


        return postRepository.save(post);
    }

    @GetMapping()
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
