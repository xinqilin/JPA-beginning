package com.bill.jpa.repository;

import com.bill.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRespository extends JpaRepository<User,Integer> {
    
}
