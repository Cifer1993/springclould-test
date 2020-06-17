package com.configure;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RibbonConfig
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/18 1:49 AM
 * Version 1.0
 **/
@Configuration
public class RibbonConfig {

    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
