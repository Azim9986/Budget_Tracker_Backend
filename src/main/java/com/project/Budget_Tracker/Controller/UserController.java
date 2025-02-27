package com.project.Budget_Tracker.Controller;

import com.project.Budget_Tracker.Model.Expenses;
import com.project.Budget_Tracker.Model.Users;
import com.project.Budget_Tracker.Service.ExpenseService;
import com.project.Budget_Tracker.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.registerUser(user);
    }

    @GetMapping("/{username}")
    public Optional<Users> getUser(@PathVariable String username){
        return userService.findByUsername(username);
    }

    @GetMapping("/expense/{description}")
    public Optional<Expenses> getExpense(@PathVariable String description){
        return expenseService.findByDescription(description);
    }

    @GetMapping("/expense/userId/{userId}")
    public ResponseEntity<List<Expenses>> getExpenseByUserId(@PathVariable Long userId){
        List<Expenses> expenses = expenseService.getExpenseBuUserId(userId);
        return ResponseEntity.ok(expenses);
    }
}
