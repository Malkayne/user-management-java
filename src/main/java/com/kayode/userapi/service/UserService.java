package com.kayode.userapi.service;

import com.kayode.userapi.dto.CreateUserRequest;
import com.kayode.userapi.dto.UpdateUserRequest;
import com.kayode.userapi.dto.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse createUser(CreateUserRequest request);

    List<UserResponse> getAllUsers();

    UserResponse getUserById(Long id);

    UserResponse updateUser(Long id, UpdateUserRequest request);

    void deleteUser(Long id);
}
