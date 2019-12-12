package com.mrliuli.consuldemo.controller;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Created by liuli on 2019/12/11.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)(RequestContextHolder.getRequestAttributes());
        return "hello consul from " + servletRequestAttributes.getRequest().getRequestURL();
    }

}