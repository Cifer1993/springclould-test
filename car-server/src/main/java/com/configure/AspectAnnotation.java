package com.configure;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName AspectAnnotation
 * @Description TODO
 * @Author Cifer
 * Date 2020/5/26 1:35 PM
 * Version 1.0
 **/
@Aspect
@Component
public class AspectAnnotation {

//    @Pointcut("execution(public * com.controller.*.*(..))")
//    private void RequestLog(){
//
//    }

    @Before("@annotation(RequestLog)")
    public void AspectBefore(JoinPoint joinPoint){
        System.out.println("执行前置通知");
        ServletRequestAttributes sra = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = sra.getRequest();
        String requestPath = request.getContextPath();
        System.out.println("执行完前置通知");
    }
}
