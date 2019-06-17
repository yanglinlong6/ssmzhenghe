package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mybatis.xml")
public class ItemsDaoTest {

    @Autowired
    ItemsDao itemsDao;
    @Test
        public void test(){
        System.out.println(itemsDao);
        List<Items> items = itemsDao.findAll();
        System.out.println(items);
    }

}