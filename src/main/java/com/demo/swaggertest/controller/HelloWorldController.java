package com.demo.swaggertest.controller;

import com.demo.swaggertest.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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


    @PostMapping("/add")
    @ApiOperation("测试添加")
    public String add(User user) {
        return user.getName() + ":" + user.getAge();
    }

    @GetMapping("/user/{id}")
    @ApiOperation("根据ID获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户编号", required = true, paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = 408, message = "指定业务得报错信息，返回客户端"),
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    public User load(@PathVariable("id") Integer id) {
        return new User(id, "jack", 32);
    }
}
