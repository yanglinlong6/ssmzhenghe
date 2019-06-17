package com.ithiema.service;

import com.ithiema.entity.User;
import java.util.List;
import java.util.Optional;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2019-06-16 22:19:26
 */
public interface UserService {

    List<User> findAll();

    User findById(Integer id);

    void update(User user);
}