package com.naveen.springboot.userrepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.springboot.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}