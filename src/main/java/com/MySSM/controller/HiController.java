package com.MySSM.controller;
import com.springmvc.dao.MessageMapper;
import com.springmvc.entity.Logindata;
import com.springmvc.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

import static org.graalvm.compiler.options.OptionType.User;

@Controller
@RequestMapping("/MySSM/controller")
public class HiController {
    private ApplicationContext applicationContext;

    @Autowired
    private MessageMapper mapper;
    /**
     * 测试相关的API函数
     */
    @RequestMapping(value="/MyRequest")
    public ModelAndView MyRe(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        //经测试发现ApplicationContext文件下的<property name="prefix" value="/WEB-INF/views/" />
        //控制返回的网页文件地址.setViewName里的参数不需要填写后缀
        return modelAndView;
    }

    /**
     * 测试返回指定的view文件名
     * @return
     */
    /**
     * 测试返回带有数据的ModelAndView对象
     * @return
     */
    @RequestMapping(value = "/signInPage")
    public ModelAndView signIn(HttpServletRequest request) {
        ModelAndView mAv=new ModelAndView();
        mAv.setViewName("signInPage");
        String get=request.getParameter("userName");
        System.out.println(get);
        return mAv;
    }
}
