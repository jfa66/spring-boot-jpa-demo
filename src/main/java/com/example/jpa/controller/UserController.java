package com.example.jpa.controller;

import com.example.jpa.dao.UserRepository;
import com.example.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author jiangfengan
 */
@RestController
@RequestMapping("/jpa")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        userRepository.save(user);
        User user2=userRepository.findByName(user.getUsername());
        return user2;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") String userId) {
        userRepository.deleteById(userId);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") String id, @RequestBody User user) {
        User user2=userRepository.getOne(id);
        if(user2==null){
            return null;
        }
        user2.setUsername(user.getUsername());
        user2.setPassword(user.getPassword());
        user2.setEmail(user.getEmail());
        return userRepository.saveAndFlush(user2);
    }

    @GetMapping("/{id}")
    public User getUserInfo(@PathVariable("id") String userId) {
        Optional<User> optional = userRepository.findById(userId);
        return optional.orElseGet(User::new);
    }

    @GetMapping("/list")
    public Page<User> pageQuery(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        return userRepository.findAll(PageRequest.of(pageNum - 1, pageSize));
    }
}
