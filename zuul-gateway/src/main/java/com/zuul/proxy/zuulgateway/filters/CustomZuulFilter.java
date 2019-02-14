package com.zuul.proxy.zuulgateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


/**
 * @author paduris
 */
@Slf4j
@Component
public class CustomZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        System.out.println("Into CustomFilter class");

        log.info("Entering CustomZuulFilter run method");

        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info("\"Request Method : \" + request.getMethod() + \" Request URL : \" + request.getRequestURL().toString()");
        System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
        log.info("Exiting CustomZuulFilter run method");

        return null;
    }
}
