package com.geekster.Instagram.services;

import com.geekster.Instagram.models.InstagramFollowing;
import com.geekster.Instagram.models.User;
import com.geekster.Instagram.repositories.IFollowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    @Autowired
    IFollowingRepo followingRepo;

    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}