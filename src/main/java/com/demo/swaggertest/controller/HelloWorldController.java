package com.demo.swaggertest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "helloWorld测试类")
@RestController
public class HelloWorldController {
    @ApiOperation("测试方法")
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "hello world";
    }


    @PostMapping("/search")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", required = true, paramType = "query"),
            @ApiImplicitParam(name = "age", value = "年龄", required = true, paramType = "query", dataType = "Integer")
    })
    @ApiOperation("测试查询")
    public String search(String name, Integer age) {
        return name + ":" + age;
    }
}
