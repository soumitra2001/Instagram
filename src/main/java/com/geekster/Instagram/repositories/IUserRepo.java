package com.geekster.Instagram.repositories;

import com.geekster.Instagram.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {

    User findFirstByEmail(String email);

    User findByUserId(Long id);
}
