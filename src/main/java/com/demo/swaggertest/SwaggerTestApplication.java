package com.demo.swaggertest;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableKnife4j
@EnableOpenApi
public class SwaggerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerTestApplication.class, args);
    }

}
