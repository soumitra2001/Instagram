package com.geekster.Instagram.repositories;


import com.geekster.Instagram.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin, Long> {

}
