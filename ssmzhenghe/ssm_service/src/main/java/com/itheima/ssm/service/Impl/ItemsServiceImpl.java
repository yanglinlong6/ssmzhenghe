package com.itheima.ssm.service.Impl;

import com.itheima.ssm.dao.ItemsDao;
import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 项目名:ssmzhenghe
 * 包名: com.itheima.ssm.service.Impl
 * 作者: Yanglinlong
 * 日期: 2019/6/17 19:59
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    ItemsDao itemsDao;

    @Override
    public List<Items> findAllAccount() {
        System.out.println("ItemsServiceImpl中的findAllAccount方法！");
        return itemsDao.findAll();
    }

    @Override
    public int saveAccount(Items items) {
        System.out.println("ItemsServiceImpl中的saveAccount方法！");
        return itemsDao.save(items);
    }
}
