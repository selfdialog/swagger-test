package com.demo.swaggertest.controller.two;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "helloWorld测试类2")
@RestController
public class HelloWorldController2 {
    @ApiOperation("测试方法2")
    @GetMapping("/helloWorld2")
    public String helloWorld() {
        return "hello world2";
    }
}
