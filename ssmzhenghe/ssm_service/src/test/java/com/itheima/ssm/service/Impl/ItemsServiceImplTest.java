package com.itheima.ssm.service.Impl;

import com.itheima.ssm.dao.ItemsDao;
import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-tx.xml")
public class ItemsServiceImplTest {
@Autowired
    ItemsService itemsService;
    @Test
    public void findAllAccount() {
        List<Items> allAccount = itemsService.findAllAccount();
        System.out.println(allAccount);
    }
}