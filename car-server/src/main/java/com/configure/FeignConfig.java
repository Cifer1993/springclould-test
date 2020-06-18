package com.configure;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/18 7:48 PM
 * Version 1.0
 **/
@Component
public class FeignConfig {

    @Bean
    public Logger.Level level(){
        return Logger.Level.BASIC;
    }
}
