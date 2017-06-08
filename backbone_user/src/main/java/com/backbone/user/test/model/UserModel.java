package com.backbone.user.test.model;

import com.backbone.user.test.entity.User;
import com.backbone.user.test.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserModel {

    @Inject
    protected UserRepository userRepository;

    public boolean checkUserAge(User newUser) {
        return (Integer.valueOf(newUser.getAge()) > 0 && Integer.valueOf(newUser.getAge()) < 101);
    }

    public boolean checkUserForDuplicate(User newUser) {
        List<User> userList = userRepository.findAll();
        for (User user : userList) {
            if (user.equals(newUser)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkUserForEmptyFields(User newUser) {
        return newUser.getName().equals("") || newUser.getAge().equals("");
    }
}
