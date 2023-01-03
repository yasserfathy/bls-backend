package com.bls.matrix.controller;

import com.bls.matrix.entity.User;
import com.bls.matrix.repo.UserRepo;
import com.bls.matrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> save(@RequestBody User user) {
        try {
            return new ResponseEntity<>(userRepo.save(user), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {

            User userObj = userRepo.findUserByName(user.getName());
                if(user.getPassword().equals(userObj.getPassword())){
                    return  ResponseEntity.ok(userObj);
                }else{
                    return null;
                }
    }

    @GetMapping("/users/{name}")
    public ResponseEntity<User> getUserByName(@PathVariable String name) {
        try {
            return new ResponseEntity<>(userService.findUserByName(name), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        try {
            return new ResponseEntity<User>(userRepo.save(user), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
