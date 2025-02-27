package com.project.Budget_Tracker.Service;

import com.project.Budget_Tracker.Model.Expenses;
import com.project.Budget_Tracker.Model.Users;
import com.project.Budget_Tracker.Repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepo expenseRepo;

    public Optional<Expenses> findByDescription(String description){
        return expenseRepo.findByDescription(description);
    }}
