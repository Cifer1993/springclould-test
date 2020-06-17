package com.configure;

import ExtConfig.ExtUserRibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName UseExtRibbonConfig
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/18 1:53 AM
 * Version 1.0
 **/
@Configuration
@RibbonClient(name = "car-server",configuration = ExtUserRibbonConfig.class)
public class UseRibbonConfig {
}
