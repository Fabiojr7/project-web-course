package com.study.course.services;

import com.study.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.study.course.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    public User insertUser(User user){
        return userRepository.save(user);
    }
}
