package com.backbone.user.test.controller;

import com.backbone.user.test.entity.User;
import com.backbone.user.test.model.UserModel;
import com.backbone.user.test.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/rest/users")
public class UserController {

    @Inject
    protected UserRepository userRepository;

    @Inject
    protected UserModel userModel;

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    boolean deleteUser(@PathVariable("id") Integer id) {
        userRepository.delete(id);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.library.path"));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public
    @ResponseBody
    User delete(@PathVariable("id") Integer id) {
        userRepository.delete(id);
        userRepository.flush();
        return new User();
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public
    @ResponseBody
    List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    User findById(@PathVariable("id") Integer id) {
        User user = userRepository.findOne(id);
        return user;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public
    @ResponseBody
    User create(@RequestBody User user) {
        if (userModel.checkUserForEmptyFields(user)) {
            return null;
        }
        if (!userModel.checkUserAge(user)) {
            return null;
        }
        if (userModel.checkUserForDuplicate(user)) {
            return null;
        }
        userRepository.saveAndFlush(user);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public
    @ResponseBody
    User update(@RequestBody User user) {
        userRepository.saveAndFlush(user);
        return user;
    }

}
