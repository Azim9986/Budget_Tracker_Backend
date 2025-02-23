package com.project.Budget_Tracker.Controller;

import com.project.Budget_Tracker.Model.Users;
import com.project.Budget_Tracker.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.registerUser(user);
    }

    @GetMapping("/{username}")
    public Optional<Users> getUser(@PathVariable String username){
        return userService.findByUsername(username);
    }
}
