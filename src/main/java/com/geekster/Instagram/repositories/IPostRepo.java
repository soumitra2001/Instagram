package com.geekster.Instagram.repositories;

import com.geekster.Instagram.models.Post;
import com.geekster.Instagram.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostRepo extends JpaRepository<Post,Integer> {
    List<Post> findByUser(User user);
}
