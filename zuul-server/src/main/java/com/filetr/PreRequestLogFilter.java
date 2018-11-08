package com.filetr;

import com.netflix.zuul.ZuulFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * Created by Administrator on 2018/11/8.
 */
//创建请求到达之前的日志信息
public class PreRequestLogFilter extends ZuulFilter{

    //返回过滤器的类型
    @Override
    public String filterType() {
        //配置个前置过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
