package com.tts.userapi.controller;

import java.util.List;
import java.util.Optional;

import com.tts.userapi.model.User;
import com.tts.userapi.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {
    
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        System.out.println(users);
        return (List<User>) userRepository.findAll();
    }
    
    GetMapping("/user/{id}")
    public User getUser(@PathVariable(value="id") Long id){

        Optional<User> user = userRepository.findById(id);

        if(user.isPresent());{
            return user.get();
        } else {
        User userError = new User();
        userError.setFirstName("Error");
        userError.setLastName("Error");
        userError.setState("Error");
        userError.setId((long) 1000000);
        return userError; 
        }
    }

    @PostMapping ("/users")
    public void createUser(@RequestBody User user){

        userRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public void editUser(@PathVariable(value="id") Long id){

    }
}
