package com.bls.matrix.service;

import com.bls.matrix.entity.User;
import com.bls.matrix.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {
     User findUserByName(String name);
}
