package com.qc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
