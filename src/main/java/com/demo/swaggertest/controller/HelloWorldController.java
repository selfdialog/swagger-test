package com.demo.swaggertest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "helloWorld测试类")
@RestController
public class HelloWorldController {
    @ApiOperation("测试方法")
    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "hello world";
    }
}
