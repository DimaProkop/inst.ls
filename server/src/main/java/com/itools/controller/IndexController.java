package com.itools.controller;

import com.itools.entity.Message;
import com.itools.entity.User;
import com.itools.repository.UserRepository;
import com.itools.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dmitry on 6.2.17.
 */

@RestController
@RequestMapping(path = "/msg")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public @ResponseBody List<Message> getMsg() {
        return this.userService.test();
    }


}
