package com.redolf.developer.ecentials.validator;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidationConfiguration {

    @Bean
    public ValidatingMongoEventListener ValidatingMongoEventListener(){
        return new ValidatingMongoEventListener(validatorFactory());
    }

    @Bean
    public LocalValidatorFactoryBean validatorFactory(){
        return new LocalValidatorFactoryBean();
    }

}
