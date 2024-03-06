package com.niigle.oneonone.service.implementation;

import com.niigle.oneonone.controller.dto.mapper.UserMapper;
import com.niigle.oneonone.controller.dto.response.UserResponse;
import com.niigle.oneonone.entity.User;
import com.niigle.oneonone.repository.UserRepository;
import com.niigle.oneonone.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserResponse> getAllUsers() {

        List<User> userList = userRepository.findAll();
        return userList.stream().map(UserMapper::entityToResponse).collect(Collectors.toList());
    }

    @Override
    public User getPersonalInfo() {


        return null;
    }
}
