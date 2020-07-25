package com.gznc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Demo02Application {

    @Bean
    public TomcatServletWebServerFactory servletContainer(){
        return new TomcatServletWebServerFactory(80) ;
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo02Application.class, args);
    }

}
