package com.ithiema.service.impl;

import com.ithiema.entity.User;
import com.ithiema.dao.UserDao;
import com.ithiema.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2019-06-16 22:19:26
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }
}