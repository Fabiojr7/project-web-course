package com.study.course.services;

import com.study.course.entities.User;
import com.study.course.services.exceptions.ResourceNotFoundException;
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
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insertUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User user){
        User entityUser = userRepository.getReferenceById(id);
        updateData(entityUser, user);
        
        return userRepository.save(entityUser);
    }

    private void updateData(User entityUser, User user) {
        entityUser.setName(user.getName());
        entityUser.setEmail(user.getEmail());
        entityUser.setPhone(user.getPhone());
    }
}
