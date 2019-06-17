package com.ithiema.dao;


import com.ithiema.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2019-06-16 22:19:26
 */
public interface UserDao extends JpaRepository<User,Integer> {

}