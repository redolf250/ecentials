package com.redolf.developer.ecentials.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    Docket documentation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Save")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.redolf.developer.ecentials"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata());
    }

    private ApiInfo metadata(){
        return new ApiInfoBuilder()
                .title("Ecentials staff api")
                .description("Staff api documentation")
                .version("1.0.0")
                .contact(new Contact("Asamaning Redolf","https://github.com/redolf250","redolfkendrick@gmail.com"))
                .license("Apache License, Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/")
                .build();
    }
}
