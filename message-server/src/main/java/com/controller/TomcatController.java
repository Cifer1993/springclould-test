package com.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName TomcatController
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/17 12:14 PM
 * Version 1.0
 **/
public class TomcatController implements ApplicationContextAware {

    private ApplicationContextAware applicationContextAware;

    @GetMapping("/shoutDownContext")
    public String shoutDownContext(){
        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext)applicationContextAware;
        configurableApplicationContext.close();
        return "context is shutdown";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContextAware = this.applicationContextAware;
    }
}
