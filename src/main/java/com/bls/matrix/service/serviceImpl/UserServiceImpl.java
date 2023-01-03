package com.bls.matrix.service.serviceImpl;

import com.bls.matrix.entity.User;
import com.bls.matrix.repo.UserRepo;
import com.bls.matrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    
    @Override
    public User findUserByName(String name) {
        return userRepo.findUserByName(name);
    }
}
