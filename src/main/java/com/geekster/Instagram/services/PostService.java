package com.geekster.Instagram.services;

import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.models.User;
import com.geekster.Instagram.repositories.IPostRepo;
import com.geekster.Instagram.repositories.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    @Autowired
    LikeService likeService;

    @Autowired
    ITokenRepo tokenRepo;
    public void addPost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getAllPosts(String token) {
        User user = tokenRepo.findFirstByToken(token).getUser();


        List<Post> postList = postRepo.findByUser(user);

        return postList;


    }

    public long getLikes(Long postId) {

        return likeService.getLikes(postId);
    }

}