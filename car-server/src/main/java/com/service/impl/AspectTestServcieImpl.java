package com.service.impl;

import com.configuration.RequestLog;
import com.service.AspectTestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName AspectServcieImpl
 * @Description TODO
 * @Author Cifer
 * Date 2020/5/13 1:30 PM
 * Version 1.0
 **/
@Service
public class AspectTestServcieImpl implements AspectTestService {
    @Override
    public void AspectA() {

    }

    @Override
    @RequestLog
    public void AspectB() {
        System.out.println("傻逼AOP");
    }
}
