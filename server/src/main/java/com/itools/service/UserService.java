package com.itools.service;

import com.itools.entity.Message;
import com.itools.entity.User;

import java.util.List;

/**
 * Created by dmitry on 6.2.17.
 */
public interface UserService {
    public List<User> findAll();
    public void saveUser(User user);
    public User findOne(long id);
    public void delete(long id);
    public List<Message> test();
}
