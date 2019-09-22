package com.springmvc.dao;

import com.springmvc.entity.Logindata;

public interface LogindataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Logindata record);

    int insertSelective(Logindata record);

    Logindata selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Logindata record);

    int updateByPrimaryKey(Logindata record);

    String selectByName(String command);

    String selectPasswordByName(String command);
}