package com.component;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName CarFacotry
 * @Description TODO
 * @Author Cifer
 * Date 2020/5/13 9:32 PM
 * Version 1.0
 **/
public class CarFacotry implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
