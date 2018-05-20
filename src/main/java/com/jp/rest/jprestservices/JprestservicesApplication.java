package com.jp.rest.jprestservices;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JprestservicesApplication extends SpringBootServletInitializer
{
    public static void main(String[] args)
    {
        new JprestservicesApplication().configure(new SpringApplicationBuilder(JprestservicesApplication.class)).run(args);
    }
}