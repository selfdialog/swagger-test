package com.demo.swaggertest.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.service.Contact;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;


@Configuration
public class Swagger3Config {
    /**
     * 配置swagger的Docket bean
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)  // 指定swagger3.0版本
                .groupName("开发者001")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo.swaggertest.controller.one"))   //扫描指定的包 常用方式
                .build()
                .apiInfo(createApiInfo())
                .enable(true);
    }

    @Bean
    public Docket createRestApi2() {
        return new Docket(DocumentationType.OAS_30)  // 指定swagger3.0版本
                .groupName("开发者002")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo.swaggertest.controller.two"))   //扫描指定的包 常用方式
                .build()
                .apiInfo(createApiInfo2())
                .enable(true);
    }

    /**
     * 配置swagger的ApiInfo bean
     *
     * @return
     */
    @Bean
    public ApiInfo createApiInfo() {
        return new ApiInfo("Swagger"
                , "Api Documentation"
                , "3.0"
                , "xxxxxxxxxx"
                , new Contact("张三", "xxxxxxx", "xxxxxxxx@126.com")
                , "Apache 2.0"
                , "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }

    @Bean
    public ApiInfo createApiInfo2() {
        return new ApiInfo("Swagger"
                , "Api Documentation"
                , "3.0"
                , "xxxxxxxxxx"
                , new Contact("李四", "xxxxxxx", "xxxxxxxx@126.com")
                , "Apache 2.0"
                , "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }
}
