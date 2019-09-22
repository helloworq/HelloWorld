package com.springmvc.dao;

import com.springmvc.entity.Messagetest;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagetestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Messagetest record);

    int insertSelective(Messagetest record);

    Messagetest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Messagetest record);

    int updateByPrimaryKey(Messagetest record);
}