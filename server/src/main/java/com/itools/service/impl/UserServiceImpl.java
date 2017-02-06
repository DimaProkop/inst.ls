package com.itools.service.impl;

import com.itools.entity.Message;
import com.itools.entity.User;
import com.itools.repository.UserRepository;
import com.itools.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 6.2.17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User findOne(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }

    @Override
    public List<Message> test() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Message 1", "hello from Server"));
        messages.add(new Message("Message 2", "smth else"));
        return messages;
    }
}
