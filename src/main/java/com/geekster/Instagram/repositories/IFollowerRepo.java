package com.geekster.Instagram.repositories;


import com.geekster.Instagram.models.InstagramFollower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowerRepo extends JpaRepository<InstagramFollower,Long> {

}
