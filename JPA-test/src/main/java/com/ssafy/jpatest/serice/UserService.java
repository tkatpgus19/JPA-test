package com.ssafy.jpatest.serice;

import com.ssafy.jpatest.entity.User;
import com.ssafy.jpatest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(e -> users.add(e));
        return users;
    }
    public List<User> findById(long id){
        List<User> users = userRepository.findById(id);
        return users;
    }
}
