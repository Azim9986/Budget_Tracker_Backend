package com.project.Budget_Tracker.Repository;

import com.project.Budget_Tracker.Model.Expenses;
import com.project.Budget_Tracker.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepo extends JpaRepository<Expenses,Long> {
    Optional<Expenses> findByDescription(String description);

//    Optional<Expenses> findByUser(String user_id);

}
