package com.hongpro.hello.apache.shardingsphere.mapper;

import com.hongpro.hello.apache.shardingsphere.domain.TbOrder;

public interface TbOrderDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    TbOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}