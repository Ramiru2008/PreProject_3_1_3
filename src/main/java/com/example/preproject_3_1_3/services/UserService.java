package com.example.preproject_3_1_3.services;

import com.example.preproject_3_1_3.entities.Role;
import com.example.preproject_3_1_3.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);

    void removeUserById(Long id);

    void edit(User user, Role role);

    User getUserById(Long id);

    User findByUsername(String username);
}
