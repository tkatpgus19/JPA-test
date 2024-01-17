package com.ssafy.jpatest.repository;

import com.ssafy.jpatest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findById(long id);
//    public List<User> findAll();
}
