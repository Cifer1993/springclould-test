package com.filetr;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/11/8.
 */
//创建请求到达之前在控制台输出
public class PreRequestLogFilter extends ZuulFilter{

    //返回过滤器的类型
    @Override
    public String filterType() {
        //配置个前置过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {

        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    //是否执行过滤器
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(request.getMethod());
        return null;
    }
}
