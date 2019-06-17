package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemsDao {
    // 查询所有
    public List<Items> findAll();
    // 新增
    public int save(Items items);
}
