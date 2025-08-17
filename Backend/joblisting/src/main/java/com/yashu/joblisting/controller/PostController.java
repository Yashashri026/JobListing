package com.yashu.joblisting.controller;

import com.yashu.joblisting.repository.PostRepo;
import com.yashu.joblisting.model.Post;
import com.yashu.joblisting.repository.SearchRepoImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class PostController {
    @Autowired
    PostRepo repo;

    @Autowired
    SearchRepoImplement srepo;

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }


    @PostMapping("/posts")
    @ResponseBody
    @CrossOrigin
    public void addPosts(@RequestBody Post p){
        repo.save(p);
    }




}
