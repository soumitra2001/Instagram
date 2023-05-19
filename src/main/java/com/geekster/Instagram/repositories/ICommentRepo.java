package com.geekster.Instagram.repositories;

import com.geekster.Instagram.models.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<InstagramComment,Long> {

}
