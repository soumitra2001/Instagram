package com.geekster.Instagram.repositories;

import com.geekster.Instagram.models.InstagramFollowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowingRepo extends JpaRepository<InstagramFollowing,Long> {

    Long countByUser_userId(long userId);

}
