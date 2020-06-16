package com.componet;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName FeignBeanFactoryPostProcessor
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/16 11:52 PM
 * Version 1.0
 **/
@Component
//public class FeignBeanFactoryPostProcessor{
    public class FeignBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    private static final String FEIGN_CONTEXT_BEAN_NAME="feignContext";
    private static final String EUREKA_AUTO_SERVICE_REGISTRATION_BEAN_NAME="eurekaAutoServiceRegistration";

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        if (containsBeanDefinition(beanFactory, FEIGN_CONTEXT_BEAN_NAME, EUREKA_AUTO_SERVICE_REGISTRATION_BEAN_NAME)) {
            BeanDefinition bd = beanFactory.getBeanDefinition(FEIGN_CONTEXT_BEAN_NAME);
            bd.setDependsOn(EUREKA_AUTO_SERVICE_REGISTRATION_BEAN_NAME);
        }
    }

    private boolean containsBeanDefinition(final ConfigurableListableBeanFactory beanFactory, String... beans) {

        return false;
    }

}