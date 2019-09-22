package com.springmvc.dao;

import com.springmvc.entity.Message;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by toutou on 2018/5/10.
 */
public class MessageMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private MessageMapper mapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(MessageMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }
    /*
    @Test
    public void insert() throws Exception {
        Message message = new Message();
        message.setCommand("吃饭6");
        message.setContent("睡觉");
        message.setDescription("打豆豆");
        int result = mapper.insert(message);
        System.out.println("插入结果->:"+result);
        assert (result == 1);
    }
    */
    /*
    @Test
    public void delete() throws Exception{
        int result = mapper.deleteByPrimaryKey(12);
        System.out.println("删除结果->:"+result);
        assert (result == 1);
    }
    */
    /*
    @Test
    public void select(){
        Message message;
        //int result = mapper.deleteByPrimaryKey(12);
        message=mapper.selectByPrimaryKey(1);
        System.out.println("查询结果->:"+message.getCommand());
        //assert (result == 1);
    }
    */
    /*
    emmm...Mybatis自动自动生成的CRUD语句太少，自己写一个查询语句供登录时匹配用
    */
    @Test
    public void query(){
        String list =mapper.selectByNamePassword("吃饭11");
        System.out.println("查询结果->:"+list);
    }
}