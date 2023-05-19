package com.geekster.Instagram.services;

import com.geekster.Instagram.models.InstagramFollower;
import com.geekster.Instagram.models.User;
import com.geekster.Instagram.repositories.IFollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    @Autowired
    IFollowerRepo followerRepo;

    public void saveFollower(User myUser, User otherUser) {


        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);

        followerRepo.save(follower);
    }
}
