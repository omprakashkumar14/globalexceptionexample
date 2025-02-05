package com.qc.service;


import org.springframework.stereotype.Service;
import com.qc.model.User;
import com.qc.repository.UserRepository;
import com.qc.exception.UserNotFoundException;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    // Constructor-based injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Retrieve a user by ID
    public User getUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + id));
    }

    // Retrieve all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Save a new user
    public User saveUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User object cannot be null");
        }
        return userRepository.save(user);
    }

    // Delete user by ID
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException("User not found with ID: " + id);
        }
        userRepository.deleteById(id);
    }
}

