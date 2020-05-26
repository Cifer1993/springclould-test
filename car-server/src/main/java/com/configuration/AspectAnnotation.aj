package com.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Aspect
@Component
@Order(1)
public class AspectAnnotation {

//    @Pointcut("@annotation(com.configuration.RequestLog)")
    @Pointcut("execution(public * com.controller.*.*(..))")
    private void RequestLog(){
        System.out.println("找到切入点");
    }

    @Before("RequestLog()")
    public void AspectBefore(JoinPoint joinPoint){
        System.out.println("找到切入点");
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        Object[] args = joinPoint.getArgs();
//        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        System.out.println("开始添加日志");
    }

    @AfterReturning("RequestLog()")
    public void AspectAfer(){
        System.out.println("找到切入点");
    }
}
