package com.example.demo.service;

import com.example.demo.model.User;

/**
 * Created by vi.tt on 30/10/2017.
 */
public interface UserService {
    User fidUserByEmail(String email);
    void saveUser(User user);
}
