package com.ithiema.controller;


import com.ithiema.entity.User;
import com.ithiema.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-06-16 22:19:26
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;
    // 查询所有
    @RequestMapping(value = "findAll")
    public List<User> findAll(){
        List<User> list = userService.findAll();
        return list;
    }
    @RequestMapping("/findById/{id}")
    public User findById(@PathVariable(value = "id") Integer id){
        User user = userService.findById(id);
        return user;
    }
    // 更新
    @RequestMapping(value = "/update")
    public void update(@RequestBody User user){ // ajax传递json的字符串，json字符串转换成javabean
        userService.update(user);
    }
}