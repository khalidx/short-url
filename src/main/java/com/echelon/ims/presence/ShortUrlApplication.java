package com.echelon.ims.presence;

import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShortUrlApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ShortUrlApplication.class, args);
    }
        
    /**
     * Configure the UrlValidator from the Apache commons-validator dependency
     */
    @Bean
    public UrlValidator urlValidator()
    {
        return new UrlValidator(new String[]{"http", "https"});   
    }
}
