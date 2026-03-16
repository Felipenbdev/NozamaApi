package com.nozama.Nozama.controller;

import com.nozama.Nozama.model.User;
import com.nozama.Nozama.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User findById(@RequestParam String id){
        return  userRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        userRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable String id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }
}