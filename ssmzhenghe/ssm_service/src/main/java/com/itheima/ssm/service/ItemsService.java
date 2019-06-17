package com.itheima.ssm.service;

import com.itheima.ssm.domain.Items;

import java.util.List;

public interface ItemsService {

    // 查询所有
    public List<Items> findAllAccount();

    // 新增
    public int saveAccount(Items items);
}
