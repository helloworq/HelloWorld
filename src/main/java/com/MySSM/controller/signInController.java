package com.MySSM.controller;

import com.springmvc.dao.LogindataMapper;
import com.springmvc.dao.MessageMapper;
import com.springmvc.entity.Logindata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/MySSM/controller")
public class signInController {
    private ApplicationContext applicationContext;

    @Autowired
    private LogindataMapper mapper;
    @RequestMapping(value = "/signInResultPage")
    public ModelAndView signInResult(HttpServletRequest request) {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 获取bean
        mapper = applicationContext.getBean(LogindataMapper.class);
        //定义返回的视图
        ModelAndView mAv=new ModelAndView();
        mAv.setViewName("signInResultPage");
        String userName=request.getParameter("userName");//获取输入的账号
        String password=request.getParameter("password");//获取输入的密码
        //开始添加数据,这里需要控制如果用户名相同的话则不予以添加
        if(mapper.selectByName(userName)==null){
            Logindata logindata=new Logindata();
            logindata.setUsername(userName);
            logindata.setPassword(password);
            int result = mapper.insert(logindata);
            System.out.println("插入结果->:"+result);
            assert (result == 1);
        }
        else {
            mAv.setViewName("errorPage");
        }
        return mAv;
    }
}
