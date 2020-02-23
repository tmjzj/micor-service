package com.micorservice.admin.service;

import com.micorservice.admin.entity.User;

import java.util.List;
import java.util.concurrent.Future;

public interface UserService {

    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);

}
