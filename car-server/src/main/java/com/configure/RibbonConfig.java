package com.configure;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName RibbonConfig
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/16 11:16 PM
 * Version 1.0
 **/
public class RibbonConfig {
    @Bean
    public IRule randomRule(){
        return new RoundRobinRule();
    }
}
