package com.config;

import config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/11/4.
 * 使用RibbonClient，为特定name的Ribbon Client自定义配置
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类
 */
@Configuration
@RibbonClient(name="provider-user",configuration = RibbonConfiguration.class)
public class ProviderUserConfiguration {
}
