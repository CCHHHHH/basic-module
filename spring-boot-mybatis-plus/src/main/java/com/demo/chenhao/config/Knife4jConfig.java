package com.demo.chenhao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Knife4jConfig {

    /**
     * SpringBoot基础框架
     */
    @Bean
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("SpringBoot基础框架")
                        .description("OpenAPI规范接口描述")
                        .version("1.0")
                        .contact("chenhaoitcode@163.com")
                        .build())
                //分组名称
                .groupName("SpringBoot基础框架接口测试")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.demo.chenhao.controller"))
                .paths(PathSelectors.any())
                .build();
    }

}
