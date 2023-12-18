package com.user.service.services;

import com.user.service.enitites.User;

import java.util.List;

public interface UserService {
    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String userId);

    //delete user
    void deleteUser(String userId);

    //update user
    User updateUser(String userId, User user);
}
