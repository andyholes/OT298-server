package com.alkemy.ong.security.service;


import com.alkemy.ong.dto.AuxUserGetDto;
import com.alkemy.ong.exception.ParameterNotFound;
import com.alkemy.ong.exception.ResourceNotFoundException;
import com.alkemy.ong.security.dto.AuthRequest;
import com.alkemy.ong.security.dto.AuthResponse;
import com.alkemy.ong.security.dto.UserGetDto;
import com.alkemy.ong.security.dto.UserPostDto;
import com.alkemy.ong.security.model.User;

import java.util.List;

import java.io.IOException;

public interface IUserService {

    AuthResponse authenticate(AuthRequest request) throws ParameterNotFound;

    void addRoleToUser (String nameRole, User user);

    UserGetDto saveTestDataUser(UserPostDto dto);

    List<UserGetDto> getAllUsers();

    UserGetDto registerUser(UserPostDto dto) throws IOException;
    
    AuxUserGetDto update(Long id, UserPostDto dto) throws ResourceNotFoundException;

}
