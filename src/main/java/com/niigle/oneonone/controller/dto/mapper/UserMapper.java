package com.niigle.oneonone.controller.dto.mapper;

import com.niigle.oneonone.controller.dto.response.UserResponse;
import com.niigle.oneonone.controller.v1.request.UserRequest;
import com.niigle.oneonone.entity.User;

public class UserMapper {

    public static UserResponse entityToResponse(User user) {

        UserResponse userResponse = new UserResponse();

        userResponse.setUserId(user.getUserId());
        userResponse.setUsername(user.getUsername());

        return userResponse;
    }

    public static User requestToEntity(UserRequest userRequest) {

        User user = new User();

        user.setUsername(userRequest.getUsername());

        return user;
    }

}
