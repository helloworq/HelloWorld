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
public class signUpController {
    private ApplicationContext applicationContext;

    @Autowired
    private LogindataMapper mapper;
    @RequestMapping(value = "/welcome")
    public ModelAndView signupResult(HttpServletRequest request) {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(LogindataMapper.class);
        //定义返回的视图
        ModelAndView mAv=new ModelAndView();
        String userName=request.getParameter("userName");//获取输入的账号
        String password=request.getParameter("password");//获取输入的密码
        //开始查询登录数据是否匹配  如果数据库中没有相应的数据将会返回null
        //匹配逻辑：先查找数据库中是否有此username没有则输出无此用户，查到了则匹配密码是否正确

        if(mapper.selectByName(userName)==null){
            mAv.setViewName("errorPage");
        }
        else{
            if(mapper.selectPasswordByName(userName).equals(password)){
                mAv.setViewName("signUpPage");
            }
            else{
                mAv.setViewName("errorPage");
            }
        }
        return mAv;
    }
}
