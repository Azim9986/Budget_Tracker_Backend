package com.project.Budget_Tracker.Service;

import com.project.Budget_Tracker.Model.Users;
import com.project.Budget_Tracker.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public  Users registerUser(Users users){
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        return userRepo.save(users);
    }

    public Optional<Users> findByUsername(String username){
        return userRepo.findByUsername(username);
    }
}
