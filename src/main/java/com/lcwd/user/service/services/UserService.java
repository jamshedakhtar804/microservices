package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    //User operations

    //Create
    User saveUser(User user);

    //Get All Users
    List<User> getAllUsers();

    //Get single user for given userId
    User getUser(String userId);

    //Delete a User for given userId
    User deleteUser(String userId);

    //Update a User for given userId
    User updateUser(String userId);
}
