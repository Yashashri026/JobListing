package com.yashu.joblisting.repository;

import com.yashu.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {

}
